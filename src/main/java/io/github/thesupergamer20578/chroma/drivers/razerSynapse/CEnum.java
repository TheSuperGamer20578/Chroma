package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.IntegerType;
import com.sun.jna.Structure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

interface CEnum<T extends Enum<T> & CEnum<T>> {
    default int getValue() {
        try {
            Value value = ((T) this).getDeclaringClass().getField(((T) this).name()).getAnnotation(Value.class);
            if (value != null) {
                return value.value();
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        StartAt start = ((T) this).getDeclaringClass().getAnnotation(StartAt.class);
        return ((T) this).ordinal() + (start != null ? start.value() : 0);
    }

    default Native<T> toNative() {
        return new Native<>((T) this);
    }

    @Structure.FieldOrder({"value"})
    class Native<T extends Enum<T> & CEnum<T>> extends IntegerType {
        private final Map<Integer, T> map = new HashMap<>();

        Native(@NotNull T value) {
            super(Integer.BYTES, value.getValue());
        }

        public Native() {
            super(Integer.BYTES);
        }

        @Nullable T toEnum() {
            return map.computeIfAbsent(this.intValue(), i -> {
                for (T t : (T[]) getClass().getTypeParameters()[0].getClass().getEnumConstants()) {
                    if (t.getValue() == i) {
                        return t;
                    }
                }
                return null;
            });
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface StartAt {
        int value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface Value {
        int value();
    }
}
