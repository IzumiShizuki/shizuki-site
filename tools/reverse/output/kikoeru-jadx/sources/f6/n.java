package f6;

import j2.h0;
import java.util.ArrayList;
import java.util.Objects;
import p4.c0;
import ya.a1;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f6753c;

    public n(String str, String str2, a1 a1Var) {
        super(str);
        p4.c.c(!a1Var.isEmpty());
        this.f6752b = str2;
        i0 i0VarQ = i0.q(a1Var);
        this.f6753c = i0VarQ;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // f6.i, m4.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(m4.k0 r9) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.n.b(m4.k0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            String str = nVar.f6740a;
            int i10 = c0.f16548a;
            if (Objects.equals(this.f6740a, str) && Objects.equals(this.f6752b, nVar.f6752b) && this.f6753c.equals(nVar.f6753c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = h0.e(527, 31, this.f6740a);
        String str = this.f6752b;
        return this.f6753c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // f6.i
    public final String toString() {
        return this.f6740a + ": description=" + this.f6752b + ": values=" + this.f6753c;
    }
}
