package b0;

import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.text.TextUtils;
import android.util.SparseArray;
import b7.c3;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.mmkv.MMKV;
import i7.s2;
import i7.u2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c1 implements j5.d1, d7.k, yc.m, f5.c, gg.e, gb.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1208b;

    public /* synthetic */ c1(int i10, Object obj) {
        this.f1207a = i10;
        this.f1208b = obj;
    }

    public b7.n A(androidx.media3.exoplayer.offline.u uVar, j2.v vVar) {
        int i10;
        long jL;
        long j10;
        boolean z10;
        o.s sVar = (o.s) this.f1208b;
        List list = (List) uVar.f969c;
        o.s sVar2 = new o.s(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            c2.v vVar2 = (c2.v) list.get(i11);
            long j11 = vVar2.f3340a;
            c2.u uVar2 = (c2.u) sVar.d(j11);
            if (uVar2 == null) {
                i10 = i11;
                j10 = vVar2.f3341b;
                jL = vVar2.f3343d;
                z10 = false;
            } else {
                long j12 = uVar2.f3337a;
                boolean z11 = uVar2.f3339c;
                i10 = i11;
                jL = vVar.L(uVar2.f3338b);
                j10 = j12;
                z10 = z11;
            }
            long j13 = vVar2.f3340a;
            List list2 = list;
            int i12 = size;
            sVar2.g(j13, new c2.t(j13, vVar2.f3341b, vVar2.f3343d, vVar2.f3344e, vVar2.f3345f, j10, jL, z10, vVar2.f3346g, vVar2.f3348i, vVar2.f3349j, vVar2.f3350k));
            boolean z12 = vVar2.f3344e;
            if (z12) {
                sVar.g(j11, new c2.u(vVar2.f3341b, vVar2.f3342c, z12));
            } else {
                sVar.h(j11);
            }
            i11 = i10 + 1;
            list = list2;
            size = i12;
        }
        return new b7.n(sVar2, uVar);
    }

    @Override // yc.m
    public Object B(bd.h hVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        de.i iVar = (de.i) this.f1208b;
        iVar.getClass();
        iVar.w(sb, hVar, null);
        ld.o oVar = hVar.f2572f;
        jc.l.d(oVar, "getVisibility(...)");
        iVar.e0(oVar, sb);
        iVar.I(hVar, sb);
        sb.append(iVar.G("typealias"));
        sb.append(" ");
        iVar.N(hVar, sb, true);
        iVar.a0(sb, hVar.L(), false);
        iVar.y(hVar, sb);
        sb.append(" = ");
        sb.append(iVar.V(((qe.s) hVar).F1()));
        return ub.a0.f21526a;
    }

    public boolean C(i2.j0 j0Var) {
        if (!j0Var.I()) {
            f2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((i2.z1) this.f1208b).remove(j0Var);
    }

    public void D(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            throw new IllegalArgumentException(q.t0.D("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        ((MediaController.TransportControls) this.f1208b).sendCustomAction(str, bundle);
    }

    public void E(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f1208b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    public c1 F(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f1208b).setUsage(i10);
        return this;
    }

    public /* bridge */ c1 G(int i10) {
        return F(i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r0 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        if (r0 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int H(m4.q r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f14544n
            r1 = 0
            if (r0 == 0) goto L82
            boolean r0 = m4.o0.m(r0)
            if (r0 != 0) goto Ld
            goto L82
        Ld:
            java.lang.String r7 = r7.f14544n
            int r0 = p4.c0.f16548a
            r7.getClass()
            int r2 = r7.hashCode()
            r3 = 4
            r4 = 1
            r5 = -1
            switch(r2) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r2 = "image/png"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L28
            goto L6b
        L28:
            r5 = 6
            goto L6b
        L2a:
            java.lang.String r2 = "image/bmp"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L33
            goto L6b
        L33:
            r5 = 5
            goto L6b
        L35:
            java.lang.String r2 = "image/webp"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L3e
            goto L6b
        L3e:
            r5 = 4
            goto L6b
        L40:
            java.lang.String r2 = "image/jpeg"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L49
            goto L6b
        L49:
            r5 = 3
            goto L6b
        L4b:
            java.lang.String r2 = "image/heif"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L54
            goto L6b
        L54:
            r5 = 2
            goto L6b
        L56:
            java.lang.String r2 = "image/heic"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L5f
            goto L6b
        L5f:
            r5 = 1
            goto L6b
        L61:
            java.lang.String r2 = "image/avif"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r5 = 0
        L6b:
            switch(r5) {
                case 0: goto L74;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                default: goto L6e;
            }
        L6e:
            goto L7d
        L6f:
            r7 = 26
            if (r0 < r7) goto L7d
            goto L78
        L74:
            r7 = 34
            if (r0 < r7) goto L7d
        L78:
            int r7 = q.t0.g(r3, r1, r1, r1)
            return r7
        L7d:
            int r7 = q.t0.g(r4, r1, r1, r1)
            return r7
        L82:
            int r7 = q.t0.g(r1, r1, r1, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c1.H(m4.q):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(float f10, f3.c cVar, hf.y yVar) {
        if (f10 <= cVar.Q(d1.f1215a)) {
            return;
        }
        h1.g gVarD = h1.t.d();
        yb.c cVar2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ic.k kVarE = gVarD != null ? gVarD.e() : null;
        h1.g gVarG = h1.t.g(gVarD);
        try {
            float fFloatValue = ((Number) ((r.k) this.f1208b).f18468b.getValue()).floatValue();
            r.k kVar = (r.k) this.f1208b;
            if (kVar.f18472f) {
                this.f1208b = r.d.l(kVar, fFloatValue - f10, 0.0f, 30);
                hf.a0.y(yVar, null, null, new b1(this, cVar2, 0), 3);
            } else {
                this.f1208b = new r.k(r.w1.f18620a, Float.valueOf(-f10), objArr2 == true ? 1 : 0, 60);
                hf.a0.y(yVar, null, null, new b1(this, objArr == true ? 1 : 0, 1), 3);
            }
            h1.t.k(gVarD, gVarG, kVarE);
        } catch (Throwable th2) {
            h1.t.k(gVarD, gVarG, kVarE);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // yc.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(bd.l r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c1.J(bd.l, java.lang.Object):java.lang.Object");
    }

    @Override // yc.m
    public Object K(bd.e0 e0Var, Object obj) throws IOException {
        bd.l lVarJ0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        de.i iVar = (de.i) this.f1208b;
        de.m mVar = iVar.f5909a;
        boolean z10 = e0Var.j() == yc.f.f26112d;
        if (!iVar.p()) {
            List listQ0 = e0Var.Q0();
            jc.l.d(listQ0, "getContextReceivers(...)");
            iVar.A(sb, listQ0);
            iVar.w(sb, e0Var, null);
            if (!z10) {
                ld.o oVarF = e0Var.f();
                jc.l.d(oVarF, "getVisibility(...)");
                iVar.e0(oVarF, sb);
            }
            if ((e0Var.j() != yc.f.f26110b || e0Var.s() != yc.x.f26158e) && (!e0Var.j().a() || e0Var.s() != yc.x.f26155b)) {
                yc.x xVarS = e0Var.s();
                jc.l.d(xVarS, "getModality(...)");
                iVar.J(xVarS, sb, de.i.t(e0Var));
            }
            iVar.I(e0Var, sb);
            iVar.L(sb, iVar.o().contains(de.j.INNER) && e0Var.d0(), "inner");
            iVar.L(sb, iVar.o().contains(de.j.DATA) && e0Var.S0(), "data");
            iVar.L(sb, iVar.o().contains(de.j.INLINE) && e0Var.l(), "inline");
            iVar.L(sb, iVar.o().contains(de.j.VALUE) && e0Var.w(), "value");
            iVar.L(sb, iVar.o().contains(de.j.FUN) && e0Var.W(), "fun");
            if (e0Var instanceof yc.p0) {
                str = "typealias";
            } else if (e0Var.R()) {
                str = "companion object";
            } else {
                int iOrdinal = e0Var.j().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new ce.j0();
                    }
                    str = "object";
                }
            }
            sb.append(iVar.G(str));
        }
        if (ee.e.l(e0Var)) {
            if (((Boolean) mVar.G.a(mVar, de.m.Y[31])).booleanValue()) {
                if (iVar.p()) {
                    sb.append("companion object");
                }
                de.i.U(sb);
                yc.k kVarY = e0Var.y();
                if (kVarY != null) {
                    sb.append("of ");
                    be.e name = kVarY.getName();
                    jc.l.d(name, "getName(...)");
                    sb.append(iVar.M(name, false));
                }
            }
            if (iVar.s() || !jc.l.a(e0Var.getName(), be.g.f2756b)) {
                if (!iVar.p()) {
                    de.i.U(sb);
                }
                be.e name2 = e0Var.getName();
                jc.l.d(name2, "getName(...)");
                sb.append(iVar.M(name2, true));
            }
        } else {
            if (!iVar.p()) {
                de.i.U(sb);
            }
            iVar.N(e0Var, sb, true);
        }
        if (!z10) {
            List listL = e0Var.L();
            jc.l.d(listL, "getDeclaredTypeParameters(...)");
            iVar.a0(sb, listL, false);
            iVar.y(e0Var, sb);
            if (!e0Var.j().a() && ((Boolean) mVar.f5939i.a(mVar, de.m.Y[7])).booleanValue() && (lVarJ0 = e0Var.j0()) != null) {
                sb.append(" ");
                iVar.w(sb, lVarJ0, null);
                bd.l lVar = lVarJ0;
                ld.o oVarF2 = lVar.f();
                jc.l.d(oVarF2, "getVisibility(...)");
                iVar.e0(oVarF2, sb);
                sb.append(iVar.G("constructor"));
                List listO0 = lVar.o0();
                jc.l.d(listO0, "getValueParameters(...)");
                iVar.d0(listO0, lVarJ0.Z(), sb);
            }
            if (!((Boolean) mVar.f5954x.a(mVar, de.m.Y[22])).booleanValue() && !vc.i.E(e0Var.E())) {
                Collection collectionI = e0Var.Q().i();
                jc.l.d(collectionI, "getSupertypes(...)");
                if (!collectionI.isEmpty() && (collectionI.size() != 1 || !vc.i.x((se.w) collectionI.iterator().next()))) {
                    de.i.U(sb);
                    sb.append(": ");
                    vb.m.e0(collectionI, sb, ", ", null, null, new de.g(iVar, 1), 60);
                }
            }
            iVar.f0(sb, listL);
        }
        return ub.a0.f21526a;
    }

    @Override // yc.m
    public Object L(bd.k kVar, Object obj) {
        ((de.i) this.f1208b).Y(kVar, (StringBuilder) obj, true);
        return ub.a0.f21526a;
    }

    @Override // yc.m
    public Object M(bd.j0 j0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        de.i iVar = (de.i) this.f1208b;
        iVar.getClass();
        be.c cVar = j0Var.f2596e;
        sb.append(iVar.G("package-fragment"));
        be.d dVar = cVar.f2744a;
        jc.l.e(dVar, "fqName");
        String strM = iVar.m(lc.b.O(be.d.f(dVar)));
        if (strM.length() > 0) {
            sb.append(" ");
            sb.append(strM);
        }
        if (iVar.f5909a.l()) {
            sb.append(" in ");
            iVar.N(j0Var.y(), sb, false);
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(yc.t r12, java.lang.StringBuilder r13) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c1.N(yc.t, java.lang.StringBuilder):void");
    }

    public void O(bd.n0 n0Var, StringBuilder sb, String str) {
        de.i iVar = (de.i) this.f1208b;
        de.m mVar = iVar.f5909a;
        int iOrdinal = ((de.r) mVar.H.a(mVar, de.m.Y[32])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                N(n0Var, sb);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new ce.j0();
                }
                return;
            }
        }
        iVar.I(n0Var, sb);
        sb.append(str.concat(" for "));
        yc.k0 k0VarD1 = n0Var.D1();
        jc.l.d(k0VarD1, "getCorrespondingProperty(...)");
        de.i.l(iVar, k0VarD1, sb);
    }

    @Override // yc.m
    public Object b(bd.h0 h0Var, Object obj) {
        ((de.i) this.f1208b).N(h0Var, (StringBuilder) obj, true);
        return ub.a0.f21526a;
    }

    @Override // j5.d1
    public void c(j5.e1 e1Var) {
        c5.k kVar = (c5.k) this.f1208b;
        kVar.f3495q.c(kVar);
    }

    public void d(u2 u2Var) {
        c1 c1Var = ((i7.d1) this.f1208b).f9079e;
        c1Var.getClass();
        ((w1) c1Var.f1208b).X(u2Var instanceof s2 ? (s2) u2Var : null, new cg.d(7, u2Var));
    }

    public void e(i2.j0 j0Var) {
        if (!j0Var.I()) {
            f2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((i2.z1) this.f1208b).add(j0Var);
    }

    public c7.a f() {
        return new c7.a(((AudioAttributes.Builder) this.f1208b).build(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g(m4.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f14534d
            java.lang.String r1 = r8.f14532b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L35
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L35
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            int r2 = p4.c0.f16548a
            r4 = 24
            if (r2 < r4) goto L27
            p4.z.g()
            java.util.Locale r2 = p4.z.h()
            goto L2b
        L27:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L2b:
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L37
        L35:
            r0 = r3
            goto L5a
        L37:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L59
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L59
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L59
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L59
            goto L5a
        L59:
        L5a:
            java.lang.String r8 = r7.h(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.q(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L74
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L73
            r1 = r3
        L73:
            r8 = r1
        L74:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c1.g(m4.q):java.lang.String");
    }

    public String h(m4.q qVar) {
        Resources resources = (Resources) this.f1208b;
        int i10 = qVar.f14536f;
        String string = (i10 & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i10 & 4) != 0) {
            string = q(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            string = q(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i10 & 1088) != 0 ? q(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // yc.m
    public Object i(bd.q0 q0Var, Object obj) {
        O(q0Var, (StringBuilder) obj, "getter");
        return ub.a0.f21526a;
    }

    @Override // yc.m
    public Object j(bd.c0 c0Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        de.i iVar = (de.i) this.f1208b;
        iVar.getClass();
        be.c cVar = c0Var.f2555d;
        sb.append(iVar.G("package"));
        be.d dVar = cVar.f2744a;
        jc.l.e(dVar, "fqName");
        String strM = iVar.m(lc.b.O(be.d.f(dVar)));
        if (strM.length() > 0) {
            sb.append(" ");
            sb.append(strM);
        }
        if (iVar.f5909a.l()) {
            sb.append(" in context of ");
            iVar.N(c0Var.f2554c, sb, false);
        }
        return ub.a0.f21526a;
    }

    @Override // gb.o
    public Object k() {
        switch (this.f1207a) {
            case 23:
                Class cls = (Class) this.f1208b;
                try {
                    return gb.t.f7512a.a(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
            default:
                Constructor constructor = (Constructor) this.f1208b;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e11) {
                    pc.f0 f0Var = jb.c.f10806a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e13.getCause());
                }
        }
    }

    public void l(ce.e eVar) {
        if (!eVar.m()) {
            if (!(eVar instanceof ce.b0)) {
                String strValueOf = String.valueOf(eVar.getClass());
                throw new IllegalArgumentException(j2.h0.n(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            ce.b0 b0Var = (ce.b0) eVar;
            l(b0Var.f3898c);
            l(b0Var.f3899d);
            return;
        }
        int size = eVar.size();
        int[] iArr = ce.b0.f3896h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i10 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f1208b;
        if (stack.isEmpty() || ((ce.e) stack.peek()).size() >= i10) {
            stack.push(eVar);
            return;
        }
        int i11 = iArr[iBinarySearch];
        ce.e b0Var2 = (ce.e) stack.pop();
        while (!stack.isEmpty() && ((ce.e) stack.peek()).size() < i11) {
            b0Var2 = new ce.b0((ce.e) stack.pop(), b0Var2);
        }
        ce.b0 b0Var3 = new ce.b0(b0Var2, eVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = ce.b0.f3896h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, b0Var3.f3897b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ce.e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                b0Var3 = new ce.b0((ce.e) stack.pop(), b0Var3);
            }
        }
        stack.push(b0Var3);
    }

    @Override // yc.m
    public /* bridge */ /* synthetic */ Object m(yc.t tVar, Object obj) {
        N(tVar, (StringBuilder) obj);
        return ub.a0.f21526a;
    }

    public n2 n() {
        c4.k kVarA = c4.k.a();
        if (kVarA.c() == 1) {
            return new b3.j(true);
        }
        x0.e1 e1VarV = x0.v.v(Boolean.FALSE);
        b3.f fVar = new b3.f(e1VarV, this);
        kVarA.f3375a.writeLock().lock();
        try {
            if (kVarA.f3377c == 1 || kVarA.f3377c == 2) {
                kVarA.f3378d.post(new c4.i(Arrays.asList(fVar), kVarA.f3377c, null));
            } else {
                kVarA.f3376b.add(fVar);
            }
            kVarA.f3375a.writeLock().unlock();
            return e1VarV;
        } catch (Throwable th2) {
            kVarA.f3375a.writeLock().unlock();
            throw th2;
        }
    }

    @Override // yc.m
    public Object o(bd.a0 a0Var, Object obj) {
        ((StringBuilder) obj).append(a0Var.getName());
        return ub.a0.f21526a;
    }

    public boolean p(int i10) {
        if (i10 < 0) {
            return false;
        }
        ah.j jVar = (ah.j) this.f1208b;
        if (i10 >= jVar.f390b) {
            return false;
        }
        i iVarP = jVar.p(i10);
        ic.k kVar = ((c0.d) iVarP.f1265c).f3056c;
        return kVar != null && kVar.a(Integer.valueOf(i10 - iVarP.f1263a)) == c0.c0.f3053a;
    }

    public String q(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f1208b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void r() {
        c5.k kVar = (c5.k) this.f1208b;
        int i10 = kVar.f3496r - 1;
        kVar.f3496r = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (c5.q qVar : kVar.f3498t) {
            qVar.j();
            i11 += qVar.I.f10379a;
        }
        m4.j1[] j1VarArr = new m4.j1[i11];
        int i12 = 0;
        for (c5.q qVar2 : kVar.f3498t) {
            qVar2.j();
            int i13 = qVar2.I.f10379a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.j();
                j1VarArr[i12] = qVar2.I.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.f3497s = new j5.o1(j1VarArr);
        kVar.f3495q.a(kVar);
    }

    public void s(Uri uri, Bundle bundle) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        D("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
    }

    public void t() {
        D("android.support.v4.media.session.action.PREPARE", null);
    }

    public String toString() {
        switch (this.f1207a) {
            case 27:
                return ((i2.z1) this.f1208b).toString();
            default:
                return super.toString();
        }
    }

    public void u(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        D("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
    }

    @Override // yc.m
    public Object v(bd.p0 p0Var, Object obj) {
        jc.l.e(p0Var, "descriptor");
        de.i.l((de.i) this.f1208b, p0Var, (StringBuilder) obj);
        return ub.a0.f21526a;
    }

    @Override // yc.m
    public Object w(bd.r0 r0Var, Object obj) {
        O(r0Var, (StringBuilder) obj, "setter");
        return ub.a0.f21526a;
    }

    public void x(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        D("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    @Override // yc.m
    public Object y(bd.y0 y0Var, Object obj) {
        ((de.i) this.f1208b).c0(y0Var, true, (StringBuilder) obj, true);
        return ub.a0.f21526a;
    }

    public void z(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        D("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    public /* synthetic */ c1(int i10, boolean z10) {
        this.f1207a = i10;
    }

    public c1(xf.c cVar) {
        this.f1207a = 19;
        jc.l.e(cVar, "json");
        this.f1208b = cVar;
    }

    public c1(MainApplication mainApplication) {
        this.f1207a = 20;
        MMKV.p(mainApplication.getApplicationContext());
        this.f1208b = MMKV.h();
    }

    public c1(Resources resources) {
        this.f1207a = 16;
        resources.getClass();
        this.f1208b = resources;
    }

    public c1(int i10) {
        this.f1207a = i10;
        switch (i10) {
            case 4:
                this.f1208b = new HashSet();
                break;
            case 6:
                this.f1208b = new o.s((Object) null);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f1208b = new c5.d(5, 1.0f, false);
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                this.f1208b = new SparseArray();
                break;
            case 11:
                this.f1208b = new AudioAttributes.Builder();
                break;
            case 15:
                this.f1208b = new Stack();
                break;
            case 18:
                this.f1208b = new c3(12);
                break;
            case 27:
                this.f1208b = new i2.z1(i2.f.f8688b);
                break;
            case 28:
                this.f1208b = new w1(this);
                break;
            default:
                this.f1208b = new r.k(r.w1.f18620a, Float.valueOf(0.0f), new r.l(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    public c1(g1.c cVar) {
        this.f1207a = 22;
        this.f1208b = new WeakReference(cVar);
    }

    public c1(long[] jArr) {
        o.b0 b0Var;
        this.f1207a = 26;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            b0Var = new o.b0(jArrCopyOf.length);
            int i10 = b0Var.f15924b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = b0Var.f15923a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        jc.l.d(jArrCopyOf2, "copyOf(...)");
                        b0Var.f15923a = jArrCopyOf2;
                    }
                    long[] jArr3 = b0Var.f15923a;
                    int i11 = b0Var.f15924b;
                    if (i10 != i11) {
                        vb.l.k0(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                    }
                    vb.l.k0(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                    b0Var.f15924b += jArrCopyOf.length;
                }
            } else {
                p.a.d("");
                throw null;
            }
        } else {
            b0Var = new o.b0(16);
        }
        this.f1208b = b0Var;
    }
}
