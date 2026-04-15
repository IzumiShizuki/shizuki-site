package app.nekogram.translator;

import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements cb.s, c4.q, gb.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1134b;

    public /* synthetic */ r(int i10) {
        this.f1133a = i10;
    }

    public static r b(p4.s sVar) {
        String str;
        sVar.H(2);
        int iU = sVar.u();
        int i10 = iU >> 1;
        int iU2 = ((sVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbP = j2.h0.p(str);
        sbP.append(i10 < 10 ? ".0" : ".");
        sbP.append(i10);
        sbP.append(iU2 < 10 ? ".0" : ".");
        sbP.append(iU2);
        return new r(8, sbP.toString());
    }

    @Override // c4.q
    public boolean Q0(CharSequence charSequence, int i10, int i11, c4.w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f1134b)) {
            return true;
        }
        wVar.f3413c = (wVar.f3413c & 3) | 4;
        return false;
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f1134b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // cb.s
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // cb.s
    public void g(Throwable th2) {
        p4.c.C("MediaNtfMng", "custom command " + this.f1134b + " produced an error: " + th2.getMessage(), th2);
    }

    @Override // gb.o
    public Object k() {
        switch (this.f1133a) {
            case 5:
                throw new eb.p(this.f1134b);
            default:
                throw new eb.p(this.f1134b);
        }
    }

    public String toString() {
        switch (this.f1133a) {
            case 7:
                return t0.E(new StringBuilder("<"), this.f1134b, '>');
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return this.f1134b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(int i10, String str) {
        this.f1133a = i10;
        this.f1134b = str;
    }

    public r(String str) {
        this.f1133a = 9;
        str.getClass();
        this.f1134b = str;
    }

    @Override // c4.q
    public Object getResult() {
        return this;
    }
}
