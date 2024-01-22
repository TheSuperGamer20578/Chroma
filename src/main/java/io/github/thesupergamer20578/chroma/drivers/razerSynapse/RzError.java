package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Error codes for Chroma SDK.
 */
public enum RzError {
    /**
     * Invalid.
     */
    INVALID(-1L),

    /**
     * Success.
     */
    SUCCESS(0L),

    /**
     * Access denied.
     */
    ACCESS_DENIED(5L),

    /**
     * Invalid handle.
     */
    INVALID_HANDLE(6L),

    /**
     * Not supported.
     */
    NOT_SUPPORTED(50L),

    /**
     * Invalid parameter.
     */
    INVALID_PARAMETER(87L),

    /**
     * The service has not been started.
     */
    SERVICE_NOT_ACTIVE(1062L),

    /**
     * Cannot start more than one instance of the specified program.
     */
    SINGLE_INSTANCE_APP(1152L),

    /**
     * Device not connected.
     */
    DEVICE_NOT_CONNECTED(1167L),

    /**
     * Element not found.
     */
    NOT_FOUND(1168L),

    /**
     * Request aborted.
     */
    REQUEST_ABORTED(1235L),

    /**
     * An attempt was made to perform an initialization operation when initialization has already been completed.
     */
    ALREADY_INITIALIZED(1247L),

    /**
     * Resource not available or disabled.
     */
    RESOURCE_DISABLED(4309L),

    /**
     * Device not available or supported.
     */
    DEVICE_NOT_AVAILABLE(4319L),

    /**
     * The group or resource is not in the correct state to perform the requested operation.
     */
    NOT_VALID_STATE(5023L),

    /**
     * No more items.
     */
    NO_MORE_ITEMS(259L),

    /**
     * General failure.
     */
    FAILED(2147500037L),

    /**
     * Unknown error
     */
    UNKNOWN(null);

    private static final Map<Long, RzError> map = new HashMap<>();
    public final @Nullable Long code;

    RzError(@Nullable Long code) {
        this.code = code;
    }

    static RzError valueOf(@Nullable Long code) {
        return map.computeIfAbsent(code, c -> {
            for (RzError error : values()) {
                if (Objects.equals(error.code, c)) {
                    return error;
                }
            }
            return UNKNOWN;
        });
    }
}
