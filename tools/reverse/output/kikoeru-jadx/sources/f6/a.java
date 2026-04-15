package f6;

import java.util.Arrays;
import java.util.Objects;
import m4.k0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6715e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f6712b = str;
        this.f6713c = str2;
        this.f6714d = i10;
        this.f6715e = bArr;
    }

    @Override // f6.i, m4.m0
    public final void b(k0 k0Var) {
        k0Var.a(this.f6715e, this.f6714d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f6714d == aVar.f6714d) {
                String str = aVar.f6712b;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f6712b, str) && Objects.equals(this.f6713c, aVar.f6713c) && Arrays.equals(this.f6715e, aVar.f6715e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f6714d) * 31;
        String str = this.f6712b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6713c;
        return Arrays.hashCode(this.f6715e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": mimeType=" + this.f6712b + ", description=" + this.f6713c;
    }
}
