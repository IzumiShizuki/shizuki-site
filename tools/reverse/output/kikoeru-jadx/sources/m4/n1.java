package m4;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n1 {
    public boolean A;
    public HashMap B;
    public HashSet C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14418h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ya.i0 f14422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ya.i0 f14423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ya.i0 f14425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ya.i0 f14429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m1 f14430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ya.i0 f14431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14435y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14436z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14411a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14412b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14413c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14414d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14419i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14420j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14421k = true;

    public n1() {
        ya.g0 g0Var = ya.i0.f25998b;
        ya.a1 a1Var = ya.a1.f25946e;
        this.f14422l = a1Var;
        this.f14423m = a1Var;
        this.f14424n = 0;
        this.f14425o = a1Var;
        this.f14426p = 0;
        this.f14427q = Integer.MAX_VALUE;
        this.f14428r = Integer.MAX_VALUE;
        this.f14429s = a1Var;
        this.f14430t = m1.f14398d;
        this.f14431u = a1Var;
        this.f14432v = 0;
        this.f14433w = 0;
        this.f14434x = false;
        this.f14435y = false;
        this.f14436z = false;
        this.A = false;
        this.B = new HashMap();
        this.C = new HashSet();
    }

    public static ya.a1 e(String[] strArr) {
        ya.f0 f0VarP = ya.i0.p();
        for (String str : strArr) {
            str.getClass();
            f0VarP.a(p4.c0.O(str));
        }
        return f0VarP.f();
    }

    public void a(k1 k1Var) {
        this.B.put(k1Var.f14346a, k1Var);
    }

    public o1 b() {
        return new o1(this);
    }

    public n1 c() {
        this.B.clear();
        return this;
    }

    public final void d(o1 o1Var) {
        this.f14411a = o1Var.f14450a;
        this.f14412b = o1Var.f14451b;
        this.f14413c = o1Var.f14452c;
        this.f14414d = o1Var.f14453d;
        this.f14415e = o1Var.f14454e;
        this.f14416f = o1Var.f14455f;
        this.f14417g = o1Var.f14456g;
        this.f14418h = o1Var.f14457h;
        this.f14419i = o1Var.f14458i;
        this.f14420j = o1Var.f14459j;
        this.f14421k = o1Var.f14460k;
        this.f14422l = o1Var.f14461l;
        this.f14423m = o1Var.f14462m;
        this.f14424n = o1Var.f14463n;
        this.f14425o = o1Var.f14464o;
        this.f14426p = o1Var.f14465p;
        this.f14427q = o1Var.f14466q;
        this.f14428r = o1Var.f14467r;
        this.f14429s = o1Var.f14468s;
        this.f14430t = o1Var.f14469t;
        this.f14431u = o1Var.f14470u;
        this.f14432v = o1Var.f14471v;
        this.f14433w = o1Var.f14472w;
        this.f14434x = o1Var.f14473x;
        this.f14435y = o1Var.f14474y;
        this.f14436z = o1Var.f14475z;
        this.A = o1Var.A;
        this.C = new HashSet(o1Var.C);
        this.B = new HashMap(o1Var.B);
    }

    public n1 f(int i10, int i11) {
        this.f14419i = i10;
        this.f14420j = i11;
        this.f14421k = true;
        return this;
    }
}
