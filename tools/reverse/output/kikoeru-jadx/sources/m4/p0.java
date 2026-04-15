package m4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14503b;

    public p0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f14502a = z10;
        this.f14503b = i10;
    }

    public static p0 a(RuntimeException runtimeException, String str) {
        return new p0(str, runtimeException, true, 1);
    }

    public static p0 b(String str, Exception exc) {
        return new p0(str, exc, true, 4);
    }

    public static p0 c(String str) {
        return new p0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f14502a);
        sb.append(", dataType=");
        sb.append(this.f14503b);
        sb.append("}");
        return sb.toString();
    }
}
