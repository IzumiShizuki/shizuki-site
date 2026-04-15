package hf;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient k1 f8535a;

    public e1(String str, Throwable th2, k1 k1Var) {
        super(str);
        this.f8535a = k1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (!jc.l.a(e1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = e1Var.f8535a;
        if (obj2 == null) {
            obj2 = n1.f8571b;
        }
        Object obj3 = this.f8535a;
        if (obj3 == null) {
            obj3 = n1.f8571b;
        }
        return jc.l.a(obj2, obj3) && jc.l.a(e1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        jc.l.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f8535a;
        if (obj == null) {
            obj = n1.f8571b;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f8535a;
        if (obj == null) {
            obj = n1.f8571b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
