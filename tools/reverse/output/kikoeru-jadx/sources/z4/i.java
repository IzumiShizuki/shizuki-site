package z4;

import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26429e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f26425a = str;
        this.f26426b = str2;
        this.f26427c = str3;
        this.f26428d = str4;
        this.f26429e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = iVar.f26425a;
        int i10 = c0.f16548a;
        return Objects.equals(this.f26425a, str) && Objects.equals(this.f26426b, iVar.f26426b) && Objects.equals(this.f26427c, iVar.f26427c) && Objects.equals(this.f26428d, iVar.f26428d) && Objects.equals(this.f26429e, iVar.f26429e);
    }

    public final int hashCode() {
        String str = this.f26425a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26426b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26427c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f26428d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f26429e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
