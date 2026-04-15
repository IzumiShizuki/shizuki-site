package e7;

import android.content.Context;
import android.os.Bundle;
import ba.q0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hf.d1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import lf.b1;
import m4.r0;
import wf.n1;
import wf.o1;
import x0.e1;
import x0.q1;
import x0.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6414b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f6413a = i10;
        this.f6414b = obj;
    }

    private final Object f(Object obj) {
        t1 t1Var = (t1) this.f6414b;
        Throwable th2 = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th2);
        synchronized (t1Var.f24468b) {
            try {
                d1 d1Var = t1Var.f24469c;
                if (d1Var != null) {
                    b1 b1Var = t1Var.f24486t;
                    q1 q1Var = q1.f24428b;
                    b1Var.getClass();
                    b1Var.m(null, q1Var);
                    d1Var.g(cancellationException);
                    t1Var.f24483q = null;
                    d1Var.B(new q0(21, t1Var, th2));
                } else {
                    t1Var.f24470d = cancellationException;
                    b1 b1Var2 = t1Var.f24486t;
                    q1 q1Var2 = q1.f24427a;
                    b1Var2.getClass();
                    b1Var2.m(null, q1Var2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, o1.l] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, uf.g] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v35 */
    @Override // ic.k
    public final Object a(Object obj) {
        ?? r17;
        String strD;
        String strConcat;
        StringBuilder sb;
        int i10;
        switch (this.f6413a) {
            case 0:
                boolean z10 = true;
                jc.y yVar = (jc.y) this.f6414b;
                String str = (String) obj;
                jc.l.e(str, "key");
                Object obj2 = yVar.f10838a;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                m0 m0Var = (m0) this.f6414b;
                j jVar = (j) obj;
                jc.l.e(jVar, "backStackEntry");
                h7.c cVar = jVar.f6340h;
                u uVar = jVar.f6334b;
                if (uVar == null) {
                    uVar = null;
                }
                if (uVar != null) {
                    cVar.a();
                    u uVarC = m0Var.c(uVar);
                    if (uVarC != null) {
                        return uVarC.equals(uVar) ? jVar : m0Var.b().b(uVarC, uVarC.a(cVar.a()));
                    }
                }
                return null;
            case 2:
                return ((c1.l) this.f6414b).i(((Integer) obj).intValue());
            case 3:
                Bundle bundle = (Bundle) obj;
                a0 a0VarQ = gh.g.q((Context) this.f6414b);
                if (bundle != null) {
                    bundle.setClassLoader(a0VarQ.f6298a.getClassLoader());
                }
                h7.g gVar = a0VarQ.f6299b;
                LinkedHashMap linkedHashMap = gVar.f8171m;
                if (bundle == null) {
                    r17 = 0;
                } else {
                    gVar.f8162d = bundle.containsKey("android-support-nav:controller:navigatorState") ? ud.n.p("android-support-nav:controller:navigatorState", bundle) : null;
                    gVar.f8163e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) ud.n.q("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            ud.s.s("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            ud.s.s("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            int i13 = i12 + 1;
                            jc.d0 d0Var = d0Var;
                            gVar.f8170l.put(Integer.valueOf(intArray[i11]), !jc.l.a(stringArrayList.get(i12), "") ? (String) stringArrayList.get(i12) : d0Var);
                            i11++;
                            i12 = i13;
                            d0Var = d0Var;
                        }
                    }
                    r17 = d0Var;
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            ud.s.s("android-support-nav:controller:backStackStates");
                            throw r17;
                        }
                        for (String str2 : stringArrayList2) {
                            String str3 = "android-support-nav:controller:backStackStates:" + str2;
                            jc.l.e(str3, "key");
                            if (bundle.containsKey(str3)) {
                                ArrayList arrayListQ = ud.n.q("android-support-nav:controller:backStackStates:" + str2, bundle);
                                vb.j jVar2 = new vb.j(arrayListQ.size());
                                Iterator it = arrayListQ.iterator();
                                while (it.hasNext()) {
                                    jVar2.addLast(new k((Bundle) it.next()));
                                }
                                linkedHashMap.put(str2, jVar2);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z11 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    ?? ValueOf = (z11 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z11) : r17;
                    a0VarQ.f6302e = ValueOf != 0 ? ValueOf.booleanValue() : false;
                }
                return a0VarQ;
            case 4:
                g1.g gVar2 = ((g1.e) this.f6414b).f7141c;
                return Boolean.valueOf(gVar2 != null ? gVar2.b(obj) : true);
            case 5:
                h1.y yVar2 = (h1.y) this.f6414b;
                synchronized (yVar2.f8095g) {
                    h1.x xVar = yVar2.f8097i;
                    jc.l.b(xVar);
                    Object obj3 = xVar.f8078b;
                    jc.l.b(obj3);
                    int i14 = xVar.f8080d;
                    o.f0 f0Var = xVar.f8079c;
                    if (f0Var == null) {
                        f0Var = new o.f0();
                        xVar.f8079c = f0Var;
                        xVar.f8082f.m(obj3, f0Var);
                    }
                    xVar.c(obj, i14, obj3, f0Var);
                }
                return ub.a0.f21526a;
            case 6:
                ha.g gVar3 = (ha.g) this.f6414b;
                String str4 = (String) obj;
                jc.l.e(str4, "it");
                gVar3.f8272c.setValue(str4);
                return ub.a0.f21526a;
            case 7:
                r0 r0Var = (r0) this.f6414b;
                jc.l.e((ka.k) obj, "it");
                ka.j.d("", null, null, new j3.q(3), new f1.f(new i9.k(i, ub.a.e(r0Var)), 2074589985, true), 191);
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                jc.d0 d0Var2 = (jc.d0) this.f6414b;
                pc.y yVar3 = (pc.y) obj;
                jc.l.e(yVar3, "it");
                d0Var2.getClass();
                pc.z zVar = yVar3.f16982a;
                pc.v vVar = yVar3.f16983b;
                if (zVar == null) {
                    return "*";
                }
                d0Var = vVar instanceof jc.d0 ? (jc.d0) vVar : null;
                String strValueOf = (d0Var == null || (strD = d0Var.d(true)) == null) ? String.valueOf(vVar) : strD;
                int iOrdinal = zVar.ordinal();
                if (iOrdinal == 0) {
                    return strValueOf;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strValueOf);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strValueOf);
                }
                throw new ce.j0();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((k8.d) this.f6414b).f11214k = true;
                return ub.a0.f21526a;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                z1.b bVar = (z1.b) this.f6414b;
                ?? r0 = (o1.l) obj;
                jc.l.e(r0, "$this$focusProperties");
                r0.c((((z1.a) ((z1.c) bVar).f26377a.getValue()).f26376a == 1 ? 1 : 0) ^ 1);
                return ub.a0.f21526a;
            case 11:
                f3.c cVar2 = (f3.c) this.f6414b;
                ((Float) obj).floatValue();
                return Float.valueOf(cVar2.Q(androidx.compose.material.a.f667a));
            case 12:
                n7.t tVar = (n7.t) this.f6414b;
                a8.a aVar = (a8.a) obj;
                jc.l.e(aVar, "db");
                tVar.f15571g = aVar;
                return ub.a0.f21526a;
            case 13:
                ((rf.c) this.f6414b).b(null);
                return ub.a0.f21526a;
            case 14:
                sf.d dVar = (sf.d) this.f6414b;
                uf.a aVar2 = (uf.a) obj;
                jc.l.e(aVar2, "$this$buildSerialDescriptor");
                uf.a.a(aVar2, "type", n1.f24153b);
                uf.a.a(aVar2, "value", ud.e.h("kotlinx.serialization.Polymorphic<" + dVar.f20014a.y() + '>', uf.i.f21703b, new uf.g[0]));
                aVar2.f21671b = vb.r.f22819a;
                return ub.a0.f21526a;
            case 15:
                q1.i0 i0Var = (q1.i0) obj;
                i0Var.m(((t0.j) this.f6414b).f20127e.e() - Float.intBitsToFloat((int) (4294967295L & i0Var.f17534o)));
                return ub.a0.f21526a;
            case 16:
                return obj == ((vb.a) this.f6414b) ? "(this Collection)" : String.valueOf(obj);
            case 17:
                vb.e eVar = (vb.e) this.f6414b;
                Map.Entry entry = (Map.Entry) obj;
                jc.l.e(entry, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == eVar ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != eVar ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 18:
                bg.k kVar = (bg.k) this.f6414b;
                uf.a aVar3 = (uf.a) obj;
                jc.l.e(aVar3, "$this$buildSerialDescriptor");
                kVar.getClass();
                aVar3.f21671b = vb.r.f22819a;
                return ub.a0.f21526a;
            case 19:
                ?? r22 = this.f6414b;
                int iIntValue = ((Integer) obj).intValue();
                return r22.q(iIntValue) + ": " + r22.s(iIntValue).m();
            case 20:
                o1 o1Var = (o1) this.f6414b;
                uf.a aVar4 = (uf.a) obj;
                jc.l.e(aVar4, "$this$buildClassSerialDescriptor");
                uf.a.a(aVar4, "first", o1Var.f24156a.a());
                uf.a.a(aVar4, "second", o1Var.f24157b.a());
                uf.a.a(aVar4, "third", o1Var.f24158c.a());
                return ub.a0.f21526a;
            case 21:
                ((x0.u) this.f6414b).y(obj);
                return ub.a0.f21526a;
            case 22:
                return f(obj);
            case 23:
                o.l0 l0Var = (o.l0) this.f6414b;
                if (obj instanceof h1.f0) {
                    ((h1.f0) obj).d(4);
                }
                l0Var.a(obj);
                return ub.a0.f21526a;
            case 24:
                x2.o oVar = (x2.o) obj;
                return ((x2.e) this.f6414b).a(new x2.o(null, oVar.f24571b, oVar.f24572c, oVar.f24573d, oVar.f24574e)).f24575a;
            case 25:
                e1 e1Var = (e1) this.f6414b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                e1Var.setValue(bool);
                return ub.a0.f21526a;
            case 26:
                xg.g gVar4 = (xg.g) this.f6414b;
                jc.l.e((IOException) obj, "it");
                TimeZone timeZone = wg.g.f24231a;
                gVar4.f25064k = true;
                return ub.a0.f21526a;
            case 27:
                y2.g gVar5 = (y2.g) obj;
                StringBuilder sbP = j2.h0.p(((y2.g) this.f6414b) == gVar5 ? " > " : "   ");
                if (gVar5 instanceof y2.a) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    y2.a aVar5 = (y2.a) gVar5;
                    sb.append(aVar5.f25353a.f20320b.length());
                    sb.append(", newCursorPosition=");
                    i10 = aVar5.f25354b;
                } else {
                    if (!(gVar5 instanceof y2.w)) {
                        if (gVar5 instanceof y2.v) {
                            strConcat = ((y2.v) gVar5).toString();
                        } else if (gVar5 instanceof y2.e) {
                            strConcat = ((y2.e) gVar5).toString();
                        } else if (gVar5 instanceof y2.f) {
                            strConcat = ((y2.f) gVar5).toString();
                        } else if (gVar5 instanceof y2.x) {
                            strConcat = ((y2.x) gVar5).toString();
                        } else if (gVar5 instanceof y2.h) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (gVar5 instanceof y2.d) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strY = jc.z.f10839a.b(gVar5.getClass()).y();
                            if (strY == null) {
                                strY = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strY);
                        }
                        sbP.append(strConcat);
                        return sbP.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    y2.w wVar = (y2.w) gVar5;
                    sb.append(wVar.f25430a.f20320b.length());
                    sb.append(", newCursorPosition=");
                    i10 = wVar.f25431b;
                }
                strConcat = j2.h0.m(sb, i10, ')');
                sbP.append(strConcat);
                return sbP.toString();
            default:
                z9.r rVar = (z9.r) this.f6414b;
                jc.l.e((f3.c) obj, "$this$offset");
                long j10 = ((p1.b) rVar.f26657e.getValue()).f16481a;
                return new f3.j((4294967295L & ((long) ((int) Float.intBitsToFloat((int) (j10 & 4294967295L))))) | (((long) ((int) Float.intBitsToFloat((int) (j10 >> 32)))) << 32));
        }
    }

    public /* synthetic */ y(int i10, Object obj, Object obj2) {
        this.f6413a = i10;
        this.f6414b = obj;
    }
}
