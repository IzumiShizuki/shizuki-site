package e6;

import java.util.Arrays;
import m4.k0;
import m4.m0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6297c;

    public c(String str, String str2, byte[] bArr) {
        this.f6295a = bArr;
        this.f6296b = str;
        this.f6297c = str2;
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // m4.m0
    public final void b(k0 k0Var) {
        String str = this.f6296b;
        if (str != null) {
            k0Var.f14318a = str;
        }
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6295a, ((c) obj).f6295a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6295a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f6296b + "\", url=\"" + this.f6297c + "\", rawMetadata.length=\"" + this.f6295a.length + "\"";
    }
}
