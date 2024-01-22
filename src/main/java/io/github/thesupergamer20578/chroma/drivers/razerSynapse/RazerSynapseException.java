package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

public class RazerSynapseException extends RuntimeException {
    public final RzError error;
    public final long code;

    RazerSynapseException(RzError error, long code) {
        super(String.format("%s (Error Code: %d)", error, code));
        this.error = error;
        this.code = code;
    }

    RazerSynapseException(RzError error, long code, Throwable cause) {
        super(String.format("%s (Error Code: %d)", error, code), cause);
        this.error = error;
        this.code = code;
    }
}
