package ce;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3972a;

    public s(String str) {
        super(str);
        this.f3972a = null;
    }

    public static s b() {
        return new s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(m mVar) {
        this.f3972a = mVar;
    }
}
