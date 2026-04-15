package k5;

import android.util.SparseBooleanArray;
import m4.o;
import yf.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11044c;

    public /* synthetic */ d(int i10) {
        this.f11042a = i10;
    }

    public void a(int i10) {
        p4.c.i(!this.f11043b);
        ((SparseBooleanArray) this.f11044c).append(i10, true);
    }

    public void b(o oVar) {
        for (int i10 = 0; i10 < oVar.f14437a.size(); i10++) {
            a(oVar.b(i10));
        }
    }

    public void c(int... iArr) {
        for (int i10 : iArr) {
            a(i10);
        }
    }

    public o d() {
        p4.c.i(!this.f11043b);
        this.f11043b = true;
        return new o((SparseBooleanArray) this.f11044c);
    }

    public void e() {
        this.f11043b = false;
    }

    public void f(byte b10) {
        ((b7.m) this.f11044c).w(String.valueOf(b10));
    }

    public void g(char c3) {
        b7.m mVar = (b7.m) this.f11044c;
        mVar.n(mVar.f1958b, 1);
        char[] cArr = (char[]) mVar.f1959c;
        int i10 = mVar.f1958b;
        mVar.f1958b = i10 + 1;
        cArr[i10] = c3;
    }

    public void h(int i10) {
        ((b7.m) this.f11044c).w(String.valueOf(i10));
    }

    public void i(long j10) {
        ((b7.m) this.f11044c).w(String.valueOf(j10));
    }

    public void j(String str) {
        jc.l.e(str, "v");
        ((b7.m) this.f11044c).w(str);
    }

    public void k(short s10) {
        ((b7.m) this.f11044c).w(String.valueOf(s10));
    }

    public void l(String str) {
        byte b10;
        jc.l.e(str, "value");
        b7.m mVar = (b7.m) this.f11044c;
        mVar.n(mVar.f1958b, str.length() + 2);
        char[] cArr = (char[]) mVar.f1959c;
        int i10 = mVar.f1958b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c3 = cArr[i13];
            byte[] bArr = v.f26334b;
            if (c3 < bArr.length && bArr[c3] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    mVar.n(i13, 2);
                    char cCharAt = str.charAt(i14);
                    byte[] bArr2 = v.f26334b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) mVar.f1959c)[i13] = cCharAt;
                        i13 = i15;
                    } else {
                        if (b10 == 1) {
                            String str2 = v.f26333a[cCharAt];
                            jc.l.b(str2);
                            mVar.n(i13, str2.length());
                            str2.getChars(0, str2.length(), (char[]) mVar.f1959c, i13);
                            int length3 = str2.length() + i13;
                            mVar.f1958b = length3;
                            i13 = length3;
                        } else {
                            char[] cArr2 = (char[]) mVar.f1959c;
                            cArr2[i13] = '\\';
                            cArr2[i13 + 1] = (char) b10;
                            i13 += 2;
                            mVar.f1958b = i13;
                        }
                    }
                }
                mVar.n(i13, 1);
                ((char[]) mVar.f1959c)[i13] = '\"';
                mVar.f1958b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        mVar.f1958b = i12 + 1;
    }

    public String toString() {
        switch (this.f11042a) {
            case 5:
                return this.f11043b ? "FALL_THROUGH" : String.valueOf(this.f11044c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(Object obj, boolean z10, int i10) {
        this.f11042a = i10;
        this.f11044c = obj;
        this.f11043b = z10;
    }

    public d(b7.m mVar) {
        this.f11042a = 6;
        this.f11044c = mVar;
        this.f11043b = true;
    }

    public d() {
        this.f11042a = 2;
        this.f11044c = new SparseBooleanArray();
    }

    public d(String str, boolean z10) {
        this.f11042a = 3;
        this.f11043b = z10;
        this.f11044c = str;
    }

    public void m() {
    }

    public void n() {
    }
}
