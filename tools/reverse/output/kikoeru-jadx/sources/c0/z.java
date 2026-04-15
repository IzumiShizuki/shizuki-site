package c0;

import a0.f0;
import b0.c1;
import b0.g0;
import b0.u0;
import b0.w0;
import b0.y0;
import b0.z0;
import i2.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import s.v0;
import u.v1;
import x0.b1;
import x0.e1;
import x0.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements v1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f3179x = g1.l.b(v.f3168b, l.f3100d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f3181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f3182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f3183d = new e1(q.f3134a, r0.f24436c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ah.j f3184e = new ah.j((byte) 0, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f3185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f3186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f3187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.b0 f3188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.e f3189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0.m f3190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z0 f3192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u.k f3193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f3194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f3196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w.k f3197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f3198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f3199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0.w0 f3200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x0.w0 f3201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c1 f3202w;

    public z(int[] iArr, int[] iArr2) {
        this.f3182c = new s(iArr, iArr2, new x(2, this, z.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 0, 0));
        Boolean bool = Boolean.FALSE;
        this.f3185f = x0.v.v(bool);
        this.f3186g = x0.v.v(bool);
        this.f3188i = new a0.b0(this, 1);
        this.f3189j = new b0.e();
        this.f3190k = new b0.m(0);
        this.f3191l = true;
        this.f3192m = new z0(null);
        this.f3193n = new u.k(new f0(5, this));
        this.f3195p = -1;
        this.f3196q = new LinkedHashMap();
        this.f3197r = new w.k();
        this.f3198s = new w0();
        this.f3199t = new androidx.compose.foundation.lazy.layout.b();
        this.f3200u = g0.g();
        this.f3201v = g0.g();
        this.f3202w = new c1(0);
    }

    @Override // u.v1
    public final boolean a() {
        return this.f3193n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r8.b(r6, r7, r0) == r4) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // u.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(s.v0 r6, ic.n r7, ac.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof c0.w
            if (r0 == 0) goto L13
            r0 = r8
            c0.w r0 = (c0.w) r0
            int r1 = r0.f3174i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3174i = r1
            goto L18
        L13:
            c0.w r0 = new c0.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3172g
            int r1 = r0.f3174i
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ub.a.f(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ac.i r6 = r0.f3171f
            r7 = r6
            ic.n r7 = (ic.n) r7
            s.v0 r6 = r0.f3170e
            c0.z r1 = r0.f3169d
            ub.a.f(r8)
            goto L57
        L3f:
            ub.a.f(r8)
            r0.f3169d = r5
            r0.f3170e = r6
            r8 = r7
            ac.i r8 = (ac.i) r8
            r0.f3171f = r8
            r0.f3174i = r3
            b0.e r8 = r5.f3189j
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r4) goto L56
            goto L68
        L56:
            r1 = r5
        L57:
            u.k r8 = r1.f3193n
            r1 = 0
            r0.f3169d = r1
            r0.f3170e = r1
            r0.f3171f = r1
            r0.f3174i = r2
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r4) goto L69
        L68:
            return r4
        L69:
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.z.b(s.v0, ic.n, ac.c):java.lang.Object");
    }

    @Override // u.v1
    public final boolean c() {
        return ((Boolean) this.f3186g.getValue()).booleanValue();
    }

    @Override // u.v1
    public final boolean d() {
        return ((Boolean) this.f3185f.getValue()).booleanValue();
    }

    @Override // u.v1
    public final float e(float f10) {
        return this.f3193n.e(f10);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void f(o oVar, boolean z10, boolean z11) {
        Object obj;
        if (!z10 && this.f3180a) {
            this.f3181b = oVar;
            return;
        }
        boolean z12 = true;
        if (z10) {
            this.f3180a = true;
        }
        float f10 = this.f3194o;
        float f11 = oVar.f3115c;
        ?? r32 = oVar.f3125m;
        int[] iArr = oVar.f3113a;
        int[] iArr2 = oVar.f3114b;
        this.f3194o = f10 - f11;
        this.f3183d.setValue(oVar);
        s sVar = this.f3182c;
        if (z11) {
            sVar.f3158d = iArr2;
            ((b1) sVar.f3160f).f(s.e((int[]) sVar.f3157c, iArr2));
        } else {
            sVar.getClass();
            int iD = s.d(iArr);
            Collection collection = (Collection) r32;
            int size = collection.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = r32.get(i10);
                if (((r) obj).f3135a == iD) {
                    break;
                } else {
                    i10++;
                }
            }
            r rVar = (r) obj;
            sVar.f3161g = rVar != null ? rVar.f3136b : null;
            ((u0) sVar.f3162h).a(iD);
            if (sVar.f3155a || oVar.f3124l > 0) {
                sVar.f3155a = true;
                h1.g gVarD = h1.t.d();
                ic.k kVarE = gVarD != null ? gVarD.e() : null;
                h1.g gVarG = h1.t.g(gVarD);
                try {
                    sVar.f3157c = iArr;
                    ((b1) sVar.f3159e).f(s.d(iArr));
                    sVar.f3158d = iArr2;
                    ((b1) sVar.f3160f).f(s.e(iArr, iArr2));
                } finally {
                    h1.t.k(gVarD, gVarG, kVarE);
                }
            }
            if (this.f3195p != -1 && !collection.isEmpty()) {
                int i11 = ((r) vb.m.Y(r32)).f3135a;
                int i12 = ((r) vb.m.h0(r32)).f3135a;
                int i13 = this.f3195p;
                if (i11 > i13 || i13 > i12) {
                    this.f3195p = -1;
                    LinkedHashMap linkedHashMap = this.f3196q;
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((y0) it.next()).cancel();
                    }
                    linkedHashMap.clear();
                }
            }
        }
        if (iArr[0] == 0 && iArr2[0] <= 0) {
            z12 = false;
        }
        this.f3186g.setValue(Boolean.valueOf(z12));
        this.f3185f.setValue(Boolean.valueOf(oVar.f3118f));
        if (z10) {
            this.f3202w.I(oVar.f3117e, oVar.f3123k, oVar.f3132t);
        }
    }

    public final o g() {
        return (o) this.f3183d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, o oVar) {
        LinkedHashMap linkedHashMap;
        int i10;
        long jH;
        if (this.f3191l) {
            ?? r0 = oVar.f3125m;
            if (((Collection) r0).isEmpty()) {
                return;
            }
            boolean z10 = f10 < 0.0f;
            int iO = z10 ? ((r) vb.m.h0(r0)).f3135a : ((r) vb.m.Y(r0)).f3135a;
            if (iO == this.f3195p) {
                return;
            }
            this.f3195p = iO;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            androidx.media3.exoplayer.offline.u uVar = oVar.f3121i;
            int[] iArr = (int[]) uVar.f969c;
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                linkedHashMap = this.f3196q;
                if (i11 >= length) {
                    break;
                }
                ah.j jVar = this.f3184e;
                if (z10) {
                    iO++;
                    int length2 = jVar.f390b + ((int[]) jVar.f391c).length;
                    while (true) {
                        if (iO >= length2) {
                            iO = jVar.f390b + ((int[]) jVar.f391c).length;
                            break;
                        } else if (jVar.b(iO, i11)) {
                            break;
                        } else {
                            iO++;
                        }
                    }
                } else {
                    iO = jVar.o(iO, i11);
                }
                if (iO < 0 || iO >= oVar.f3124l || linkedHashSet.contains(Integer.valueOf(iO))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(iO));
                if (!linkedHashMap.containsKey(Integer.valueOf(iO))) {
                    boolean zP = oVar.f3122j.p(iO);
                    int i12 = zP ? 0 : i11;
                    int i13 = zP ? length : 1;
                    if (i13 == 1) {
                        i10 = iArr[i12];
                    } else {
                        int[] iArr2 = (int[]) uVar.f968b;
                        int i14 = iArr2[i12];
                        int i15 = (i12 + i13) - 1;
                        i10 = (iArr2[i15] + iArr[i15]) - i14;
                    }
                    if (oVar.f3133u == u.e1.f20882a) {
                        if (i10 < 0) {
                            f3.i.a("width must be >= 0");
                        }
                        jH = f3.b.h(i10, i10, 0, Integer.MAX_VALUE);
                    } else {
                        if (i10 < 0) {
                            f3.i.a("height must be >= 0");
                        }
                        jH = f3.b.h(0, Integer.MAX_VALUE, i10, i10);
                    }
                    linkedHashMap.put(Integer.valueOf(iO), this.f3192m.a(iO, jH));
                }
                i11++;
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!linkedHashSet.contains(entry.getKey())) {
                    ((y0) entry.getValue()).cancel();
                    it.remove();
                }
            }
        }
    }

    public final Object i(int i10, yb.c cVar) {
        Object objB = b(v0.f19292a, new y(this, i10, (yb.c) null), (ac.c) cVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }
}
