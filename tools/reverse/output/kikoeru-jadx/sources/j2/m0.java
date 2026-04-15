package j2;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends jc.m implements ic.a {
    public static final m0 A;
    public static final m0 B;
    public static final m0 C;
    public static final m0 D;
    public static final m0 E;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f9884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f9885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f9886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f9887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0 f9888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0 f9889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m0 f9890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f9891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f9892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m0 f9893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m0 f9894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m0 f9895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m0 f9896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m0 f9897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m0 f9898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0 f9899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m0 f9900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m0 f9901t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m0 f9902u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m0 f9903v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m0 f9904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m0 f9905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m0 f9906y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final m0 f9907z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9908b;

    static {
        int i10 = 0;
        f9884c = new m0(i10, 0);
        f9885d = new m0(i10, 1);
        f9886e = new m0(i10, 2);
        f9887f = new m0(i10, 3);
        f9888g = new m0(i10, 4);
        f9889h = new m0(i10, 5);
        f9890i = new m0(i10, 6);
        f9891j = new m0(i10, 7);
        f9892k = new m0(i10, 8);
        f9893l = new m0(i10, 9);
        f9894m = new m0(i10, 10);
        f9895n = new m0(i10, 11);
        f9896o = new m0(i10, 12);
        f9897p = new m0(i10, 13);
        f9898q = new m0(i10, 14);
        f9899r = new m0(i10, 15);
        f9900s = new m0(i10, 16);
        f9901t = new m0(i10, 17);
        f9902u = new m0(i10, 18);
        f9903v = new m0(i10, 19);
        f9904w = new m0(i10, 20);
        f9905x = new m0(i10, 21);
        f9906y = new m0(i10, 22);
        f9907z = new m0(i10, 23);
        A = new m0(i10, 24);
        B = new m0(i10, 25);
        C = new m0(i10, 26);
        D = new m0(i10, 27);
        E = new m0(i10, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, int i11) {
        super(i10);
        this.f9908b = i11;
    }

    @Override // ic.a
    public final Object b() {
        Choreographer choreographer;
        yb.c cVar = null;
        switch (this.f9908b) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    pf.e eVar = hf.l0.f8566a;
                    choreographer = (Choreographer) hf.a0.C(nf.n.f15850a, new a0.c0(2, cVar, 11));
                }
                t0 t0Var = new t0(choreographer, n7.e.h(Looper.getMainLooper()));
                return ud.b.C(t0Var, t0Var.f10003l);
            case 6:
            case 7:
                return null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                l1.b("LocalAutofillManager");
                throw null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                l1.b("LocalAutofillTree");
                throw null;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                l1.b("LocalClipboard");
                throw null;
            case 11:
                l1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                l1.b("LocalDensity");
                throw null;
            case 14:
                l1.b("LocalFocusManager");
                throw null;
            case 15:
                l1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                l1.b("LocalFontLoader");
                throw null;
            case 17:
                l1.b("LocalGraphicsContext");
                throw null;
            case 18:
                l1.b("LocalHapticFeedback");
                throw null;
            case 19:
                l1.b("LocalInputManager");
                throw null;
            case 20:
                l1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                l1.b("LocalTextToolbar");
                throw null;
            case 26:
                l1.b("LocalUriHandler");
                throw null;
            case 27:
                l1.b("LocalViewConfiguration");
                throw null;
            default:
                l1.b("LocalWindowInfo");
                throw null;
        }
    }
}
