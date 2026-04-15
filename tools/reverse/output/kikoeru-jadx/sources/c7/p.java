package c7;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3686g;

    public p(s8.i iVar, List list, int i10, s8.i iVar2, t8.h hVar, h8.c cVar, boolean z10) {
        this.f3682c = iVar;
        this.f3683d = list;
        this.f3680a = i10;
        this.f3684e = iVar2;
        this.f3685f = hVar;
        this.f3686g = cVar;
        this.f3681b = z10;
    }

    public void a(s8.i iVar, n8.g gVar) {
        Context context = iVar.f19614a;
        s8.i iVar2 = (s8.i) this.f3682c;
        if (context != iVar2.f19614a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.f19615b == s8.k.f19640a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.f19616c != iVar2.f19616c) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.f19634u != iVar2.f19634u) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.f19635v == iVar2.f19635v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public boolean b() {
        return this.f3680a < ((List) this.f3685f).size() || !((ArrayList) this.f3686g).isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s8.i r14, ac.c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f3683d
            java.util.List r0 = (java.util.List) r0
            int r1 = r13.f3680a
            boolean r2 = r15 instanceof n8.h
            if (r2 == 0) goto L19
            r2 = r15
            n8.h r2 = (n8.h) r2
            int r3 = r2.f15659h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f15659h = r3
            goto L1e
        L19:
            n8.h r2 = new n8.h
            r2.<init>(r13, r15)
        L1e:
            java.lang.Object r15 = r2.f15657f
            int r3 = r2.f15659h
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            n8.g r14 = r2.f15656e
            c7.p r0 = r2.f15655d
            ub.a.f(r15)
            goto L7e
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            ub.a.f(r15)
            if (r1 <= 0) goto L47
            int r15 = r1 + (-1)
            java.lang.Object r15 = r0.get(r15)
            n8.g r15 = (n8.g) r15
            r13.a(r14, r15)
        L47:
            java.lang.Object r15 = r0.get(r1)
            n8.g r15 = (n8.g) r15
            int r8 = r1 + 1
            java.lang.Object r0 = r13.f3685f
            r10 = r0
            t8.h r10 = (t8.h) r10
            c7.p r5 = new c7.p
            java.lang.Object r0 = r13.f3682c
            r6 = r0
            s8.i r6 = (s8.i) r6
            java.lang.Object r0 = r13.f3683d
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r13.f3686g
            r11 = r0
            h8.c r11 = (h8.c) r11
            boolean r12 = r13.f3681b
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.f15655d = r13
            r2.f15656e = r15
            r2.f15659h = r4
            java.lang.Object r14 = r15.d(r5, r2)
            zb.a r0 = zb.a.f26667a
            if (r14 != r0) goto L7a
            return r0
        L7a:
            r0 = r15
            r15 = r14
            r14 = r0
            r0 = r13
        L7e:
            s8.j r15 = (s8.j) r15
            s8.i r1 = r15.b()
            r0.a(r1, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.p.c(s8.i, ac.c):java.lang.Object");
    }

    public void d() {
        if (this.f3681b) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3682c);
        }
        this.f3681b = true;
        Bundle bundle = (Bundle) this.f3685f;
        String str = (String) this.f3684e;
        o.e eVar = ((f0) this.f3686g).f3626e;
        s sVar = (s) this.f3683d;
        n nVar = sVar.f3723e;
        String str2 = sVar.f3719a;
        nVar.getClass();
        if (eVar.get(nVar.f3672a.getBinder()) != sVar) {
            if (f0.f3621i) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str2 + " id=" + str);
                return;
            }
            return;
        }
        if ((1 & this.f3680a) != 0) {
            boolean z10 = f0.f3621i;
        }
        try {
            nVar.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            nVar.b(3, bundle2);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + str2);
        }
    }

    public p(ug.a aVar, xa.h hVar, zg.n nVar, boolean z10) {
        List listJ;
        jc.l.e(hVar, "routeDatabase");
        this.f3683d = aVar;
        this.f3684e = hVar;
        this.f3681b = z10;
        vb.r rVar = vb.r.f22819a;
        this.f3685f = rVar;
        this.f3682c = rVar;
        this.f3686g = new ArrayList();
        ug.t tVar = aVar.f21716h;
        jc.l.e(tVar, "url");
        URI uriI = tVar.i();
        if (uriI.getHost() == null) {
            listJ = wg.g.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = aVar.f21715g.select(uriI);
            List<Proxy> list = listSelect;
            if (list != null && !list.isEmpty()) {
                listJ = wg.g.i(listSelect);
            } else {
                listJ = wg.g.j(new Proxy[]{Proxy.NO_PROXY});
            }
        }
        this.f3685f = listJ;
        this.f3680a = 0;
    }

    public p(f0 f0Var, Object obj, s sVar, String str, Bundle bundle) {
        this.f3686g = f0Var;
        this.f3683d = sVar;
        this.f3684e = str;
        this.f3685f = bundle;
        this.f3682c = obj;
    }
}
