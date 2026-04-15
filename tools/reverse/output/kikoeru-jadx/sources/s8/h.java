package s8;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import hd.q0;
import hf.u;
import java.util.LinkedHashMap;
import java.util.List;
import ud.s;
import vb.r;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f19590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f19591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u8.a f19592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap.Config f19593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t8.d f19594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f19595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w8.e f19596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q0 f19597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f19598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f19600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i4.d f19602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f19603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f19604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f19605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f19606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f19607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f19608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t8.i f19609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t8.g f19610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f19611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t8.i f19612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t8.g f19613y;

    public h(Context context) {
        this.f19589a = context;
        this.f19590b = x8.c.f24837a;
        this.f19591c = null;
        this.f19592d = null;
        this.f19593e = null;
        this.f19594f = null;
        this.f19595g = r.f22819a;
        this.f19596h = null;
        this.f19597i = null;
        this.f19598j = null;
        this.f19599k = true;
        this.f19600l = null;
        this.f19601m = true;
        this.f19602n = null;
        this.f19603o = null;
        this.f19604p = null;
        this.f19605q = null;
        this.f19606r = null;
        this.f19607s = null;
        this.f19608t = null;
        this.f19609u = null;
        this.f19610v = null;
        this.f19611w = null;
        this.f19612x = null;
        this.f19613y = null;
    }

    public final void a(String str) {
        q0 q0Var = this.f19597i;
        if (q0Var == null) {
            q0Var = new q0((byte) 0, 5);
            this.f19597i = q0Var;
        }
        q0Var.g("authorization", str);
    }

    public final i b() {
        Object obj = this.f19591c;
        if (obj == null) {
            obj = k.f19640a;
        }
        Object obj2 = obj;
        u8.a aVar = this.f19592d;
        Bitmap.Config config = this.f19593e;
        if (config == null) {
            config = this.f19590b.f19573g;
        }
        Bitmap.Config config2 = config;
        t8.d dVar = this.f19594f;
        if (dVar == null) {
            dVar = this.f19590b.f19572f;
        }
        t8.d dVar2 = dVar;
        List list = this.f19595g;
        w8.e eVar = this.f19596h;
        if (eVar == null) {
            eVar = this.f19590b.f19571e;
        }
        w8.e eVar2 = eVar;
        q0 q0Var = this.f19597i;
        ug.r rVarK = q0Var != null ? q0Var.k() : null;
        if (rVarK == null) {
            rVarK = x8.d.f24840c;
        } else {
            Bitmap.Config[] configArr = x8.d.f24838a;
        }
        ug.r rVar = rVarK;
        LinkedHashMap linkedHashMap = this.f19598j;
        p pVar = linkedHashMap != null ? new p(s.A(linkedHashMap)) : null;
        if (pVar == null) {
            pVar = p.f19665b;
        }
        p pVar2 = pVar;
        Boolean bool = this.f19600l;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f19590b.f19574h;
        this.f19590b.getClass();
        c cVar = this.f19590b;
        b bVar = cVar.f19575i;
        b bVar2 = cVar.f19576j;
        b bVar3 = cVar.f19577k;
        u uVar = cVar.f19567a;
        u uVar2 = cVar.f19568b;
        u uVar3 = cVar.f19569c;
        u uVar4 = cVar.f19570d;
        q qVarF = this.f19611w;
        Context context = this.f19589a;
        if (qVarF == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof x) {
                    qVarF = ((x) baseContext).f();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    qVarF = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (qVarF == null) {
                qVarF = g.f19587b;
            }
        }
        q qVar = qVarF;
        t8.i cVar2 = this.f19609u;
        if (cVar2 == null && (cVar2 = this.f19612x) == null) {
            cVar2 = new t8.c(context);
        }
        t8.i iVar = cVar2;
        t8.g gVar = this.f19610v;
        if (gVar == null && (gVar = this.f19613y) == null) {
            gVar = t8.g.f20560b;
        }
        t8.g gVar2 = gVar;
        i4.d dVar3 = this.f19602n;
        n nVar = dVar3 != null ? new n(s.A(dVar3.f9004a)) : null;
        if (nVar == null) {
            nVar = n.f19656b;
        }
        return new i(context, obj2, aVar, config2, dVar2, list, eVar2, rVar, pVar2, this.f19599k, zBooleanValue, false, this.f19601m, bVar, bVar2, bVar3, uVar, uVar2, uVar3, uVar4, qVar, iVar, gVar2, nVar, this.f19603o, this.f19604p, this.f19605q, this.f19606r, this.f19607s, this.f19608t, new d(this.f19609u, this.f19610v, this.f19596h, this.f19594f, this.f19593e, this.f19600l), this.f19590b);
    }

    public h(i iVar, Context context) {
        this.f19589a = context;
        this.f19590b = iVar.F;
        this.f19591c = iVar.f19615b;
        this.f19592d = iVar.f19616c;
        d dVar = iVar.E;
        this.f19593e = dVar.f19582e;
        this.f19594f = dVar.f19581d;
        this.f19595g = iVar.f19619f;
        this.f19596h = dVar.f19580c;
        this.f19597i = iVar.f19621h.j();
        this.f19598j = w.C(iVar.f19622i.f19666a);
        this.f19599k = iVar.f19623j;
        this.f19600l = dVar.f19583f;
        this.f19601m = iVar.f19626m;
        this.f19602n = new i4.d(iVar.f19637x);
        this.f19603o = iVar.f19638y;
        this.f19604p = iVar.f19639z;
        this.f19605q = iVar.A;
        this.f19606r = iVar.B;
        this.f19607s = iVar.C;
        this.f19608t = iVar.D;
        this.f19609u = dVar.f19578a;
        this.f19610v = dVar.f19579b;
        if (iVar.f19614a == context) {
            this.f19611w = iVar.f19634u;
            this.f19612x = iVar.f19635v;
            this.f19613y = iVar.f19636w;
        } else {
            this.f19611w = null;
            this.f19612x = null;
            this.f19613y = null;
        }
    }
}
