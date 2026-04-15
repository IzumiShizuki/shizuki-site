package b7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c3 implements p3, p4.g, xa.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1700a;

    public /* synthetic */ c3(int i10) {
        this.f1700a = i10;
    }

    public static Bitmap a(byte[] bArr, int i10) throws f5.d {
        try {
            return nd.h.f(bArr, i10, -1);
        } catch (m4.p0 e10) {
            throw new f5.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new f5.d(e11);
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f1700a) {
            case 1:
                ((z3) obj).p0();
                break;
            case 2:
            case 5:
            default:
                ((j5.z0) obj).f10501b.a();
                break;
            case 3:
                ((z3) obj).c();
                break;
            case 4:
                ((z3) obj).v();
                break;
            case 6:
                z3 z3Var = (z3) obj;
                z3Var.r0();
                ((v4.v) ((androidx.lifecycle.q) z3Var.f2227a)).V1(0, Integer.MAX_VALUE);
                break;
        }
    }

    @Override // xa.d
    public Object apply(Object obj) {
        switch (this.f1700a) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                c5.q qVar = (c5.q) obj;
                qVar.j();
                return ya.i0.q(ya.q.v(qVar.I.f10380b, new c3(19)));
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 20:
            case 21:
            default:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = bundle.getBundle(m4.h1.f14255t);
                m4.i0 i0VarA = bundle2 != null ? m4.i0.a(bundle2) : m4.i0.f14278g;
                long j10 = bundle.getLong(m4.h1.f14256u, -9223372036854775807L);
                long j11 = bundle.getLong(m4.h1.f14257v, -9223372036854775807L);
                long j12 = bundle.getLong(m4.h1.f14258w, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(m4.h1.f14259x, false);
                boolean z11 = bundle.getBoolean(m4.h1.f14260y, false);
                Bundle bundle3 = bundle.getBundle(m4.h1.f14261z);
                m4.c0 c0VarB = bundle3 != null ? m4.c0.b(bundle3) : null;
                boolean z12 = bundle.getBoolean(m4.h1.A, false);
                long j13 = bundle.getLong(m4.h1.B, 0L);
                long j14 = bundle.getLong(m4.h1.C, -9223372036854775807L);
                int i10 = bundle.getInt(m4.h1.D, 0);
                int i11 = bundle.getInt(m4.h1.E, 0);
                long j15 = bundle.getLong(m4.h1.F, 0L);
                m4.h1 h1Var = new m4.h1();
                h1Var.b(m4.h1.f14253r, i0VarA, null, j10, j11, j12, z10, z11, c0VarB, j13, j14, i10, i11, j15);
                h1Var.f14272k = z12;
                return h1Var;
            case 16:
                return ((r5.n) obj).c().getClass().getSimpleName();
            case 17:
                return ya.i0.q(ya.q.v(((j5.b0) obj).q().f10380b, new c3(19)));
            case 19:
                return Integer.valueOf(((m4.j1) obj).f14306c);
            case 22:
                return Long.valueOf(((o6.a) obj).f16243b);
            case 23:
                return Long.valueOf(((o6.a) obj).f16244c);
            case 24:
                return (l6.q) obj;
            case 25:
                m4.u uVar = (m4.u) obj;
                return uVar.f14589a + ": " + uVar.f14590b;
            case 26:
                m4.b1 b1Var = (m4.b1) obj;
                b1Var.getClass();
                Bundle bundle4 = new Bundle();
                int i12 = b1Var.f14140a;
                if (i12 != 0) {
                    bundle4.putInt(m4.b1.f14137d, i12);
                }
                int i13 = b1Var.f14141b;
                if (i13 != 0) {
                    bundle4.putInt(m4.b1.f14138e, i13);
                }
                int i14 = b1Var.f14142c;
                if (i14 != 0) {
                    bundle4.putInt(m4.b1.f14139f, i14);
                }
                return bundle4;
            case 27:
                m4.h0 h0Var = (m4.h0) obj;
                h0Var.getClass();
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable(m4.h0.f14238h, h0Var.f14245a);
                String str = h0Var.f14246b;
                if (str != null) {
                    bundle5.putString(m4.h0.f14239i, str);
                }
                String str2 = h0Var.f14247c;
                if (str2 != null) {
                    bundle5.putString(m4.h0.f14240j, str2);
                }
                int i15 = h0Var.f14248d;
                if (i15 != 0) {
                    bundle5.putInt(m4.h0.f14241k, i15);
                }
                int i16 = h0Var.f14249e;
                if (i16 != 0) {
                    bundle5.putInt(m4.h0.f14242l, i16);
                }
                String str3 = h0Var.f14250f;
                if (str3 != null) {
                    bundle5.putString(m4.h0.f14243m, str3);
                }
                String str4 = h0Var.f14251g;
                if (str4 != null) {
                    bundle5.putString(m4.h0.f14244n, str4);
                }
                return bundle5;
            case 28:
                Bundle bundle6 = (Bundle) obj;
                Uri uri = (Uri) bundle6.getParcelable(m4.h0.f14238h);
                uri.getClass();
                String string = bundle6.getString(m4.h0.f14239i);
                String string2 = bundle6.getString(m4.h0.f14240j);
                int i17 = bundle6.getInt(m4.h0.f14241k, 0);
                int i18 = bundle6.getInt(m4.h0.f14242l, 0);
                String string3 = bundle6.getString(m4.h0.f14243m);
                String string4 = bundle6.getString(m4.h0.f14244n);
                m4.g0 g0Var = new m4.g0();
                g0Var.f14213a = uri;
                g0Var.f14214b = m4.o0.p(string);
                g0Var.f14215c = string2;
                g0Var.f14216d = i17;
                g0Var.f14217e = i18;
                g0Var.f14218f = string3;
                g0Var.f14219g = string4;
                return new m4.h0(g0Var);
        }
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        switch (this.f1700a) {
            case 0:
                c2Var.getClass();
                throw new ClassCastException();
            case 2:
                c2Var.getClass();
                throw new ClassCastException();
            case 5:
                c2Var.getClass();
                throw new ClassCastException();
            case 7:
                c2Var.getClass();
                throw new ClassCastException();
            default:
                pe.d dVar = c2Var.f1678e;
                c2Var.r(t1Var);
                dVar.getClass();
                return g8.a.Q(new i4(-6));
        }
    }

    public /* synthetic */ c3(j2.t1 t1Var) {
        this.f1700a = 15;
    }
}
