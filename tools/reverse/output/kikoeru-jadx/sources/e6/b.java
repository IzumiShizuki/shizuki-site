package e6;

import j2.h0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m4.k0;
import m4.m0;
import m4.q;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6294f;

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        p4.c.c(i11 == -1 || i11 > 0);
        this.f6289a = i10;
        this.f6290b = str;
        this.f6291c = str2;
        this.f6292d = str3;
        this.f6293e = z10;
        this.f6294f = i11;
    }

    public static b d(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i13 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z10 = true;
                } else {
                    try {
                        p4.c.B("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        h0.v("Invalid bitrate header: ", str4, "IcyHeaders");
                        i10 = i12;
                        z10 = false;
                    }
                }
                i10 = i12;
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i13 = i14;
                } else {
                    try {
                        p4.c.B("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        h0.v("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
            i11 = i13;
        } else {
            i11 = -1;
        }
        if (z10) {
            return new b(i10, i11, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // m4.m0
    public final void b(k0 k0Var) {
        String str = this.f6291c;
        if (str != null) {
            k0Var.F = str;
        }
        String str2 = this.f6290b;
        if (str2 != null) {
            k0Var.D = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6289a == bVar.f6289a) {
                String str = bVar.f6290b;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f6290b, str) && Objects.equals(this.f6291c, bVar.f6291c) && Objects.equals(this.f6292d, bVar.f6292d) && this.f6293e == bVar.f6293e && this.f6294f == bVar.f6294f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f6289a) * 31;
        String str = this.f6290b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6291c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6292d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6293e ? 1 : 0)) * 31) + this.f6294f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f6291c + "\", genre=\"" + this.f6290b + "\", bitrate=" + this.f6289a + ", metadataInterval=" + this.f6294f;
    }
}
