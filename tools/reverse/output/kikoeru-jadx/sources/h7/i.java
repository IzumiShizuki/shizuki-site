package h7;

import android.net.Uri;
import android.os.Bundle;
import e7.t;
import e7.u;
import g2.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import jc.l;
import o.l0;
import o.t0;
import p4.c0;
import p4.s;
import q4.q;
import q4.r;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8192f;

    public i(r rVar) {
        this.f8188b = rVar;
        this.f8189c = new ArrayDeque();
        this.f8190d = new ArrayDeque();
        this.f8191e = new PriorityQueue();
        this.f8187a = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f17775b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r9, p4.s r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8190d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r8.f8191e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            int r2 = r8.f8187a
            if (r2 == 0) goto L9e
            r3 = -1
            if (r2 == r3) goto L27
            int r2 = r1.size()
            int r4 = r8.f8187a
            if (r2 < r4) goto L27
            java.lang.Object r2 = r1.peek()
            q4.q r2 = (q4.q) r2
            int r4 = p4.c0.f16548a
            long r4 = r2.f17775b
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            goto L9e
        L27:
            java.lang.Object r2 = r8.f8189c
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L37
            p4.s r2 = new p4.s
            r2.<init>()
            goto L3d
        L37:
            java.lang.Object r2 = r2.pop()
            p4.s r2 = (p4.s) r2
        L3d:
            int r4 = r11.a()
            r2.D(r4)
            byte[] r4 = r11.f16611a
            int r11 = r11.f16612b
            byte[] r5 = r2.f16611a
            int r6 = r2.a()
            r7 = 0
            java.lang.System.arraycopy(r4, r11, r5, r7, r6)
            java.lang.Object r11 = r8.f8192f
            q4.q r11 = (q4.q) r11
            if (r11 == 0) goto L64
            long r4 = r11.f17775b
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 != 0) goto L64
            java.util.ArrayList r9 = r11.f17774a
            r9.add(r2)
            return
        L64:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L70
            q4.q r11 = new q4.q
            r11.<init>()
            goto L76
        L70:
            java.lang.Object r11 = r0.pop()
            q4.q r11 = (q4.q) r11
        L76:
            java.util.ArrayList r0 = r11.f17774a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 == 0) goto L82
            r7 = 1
        L82:
            p4.c.c(r7)
            boolean r4 = r0.isEmpty()
            p4.c.i(r4)
            r11.f17775b = r9
            r0.add(r2)
            r1.add(r11)
            r8.f8192f = r11
            int r9 = r8.f8187a
            if (r9 == r3) goto L9d
            r8.b(r9)
        L9d:
            return
        L9e:
            java.lang.Object r0 = r8.f8188b
            q4.r r0 = (q4.r) r0
            r0.a(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.i.a(long, p4.s):void");
    }

    public void b(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f8191e;
        while (priorityQueue.size() > i10) {
            q qVar = (q) priorityQueue.poll();
            int i11 = c0.f16548a;
            int i12 = 0;
            while (true) {
                arrayList = qVar.f17774a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                ((r) this.f8188b).a(qVar.f17775b, (s) arrayList.get(i12));
                ((ArrayDeque) this.f8189c).push((s) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            q qVar2 = (q) this.f8192f;
            if (qVar2 != null && qVar2.f17775b == qVar.f17775b) {
                this.f8192f = null;
            }
            ((ArrayDeque) this.f8190d).push(qVar);
        }
    }

    public t c(String str) {
        e7.r rVar;
        l.e(str, "route");
        p pVar = (p) this.f8192f;
        if (pVar == null || (rVar = (e7.r) pVar.getValue()) == null) {
            return null;
        }
        int i10 = u.f6398e;
        String strConcat = "android-app://androidx.navigation/".concat(str);
        l.e(strConcat, "uriString");
        Uri uri = Uri.parse(strConcat);
        l.d(uri, "parse(...)");
        Bundle bundleD = rVar.d(uri, (LinkedHashMap) this.f8190d);
        if (bundleD == null) {
            return null;
        }
        return new t((u) this.f8188b, bundleD, rVar.f6390l, rVar.b(uri), false, -1);
    }

    public i() {
        this.f8188b = new v[32];
        this.f8189c = new float[32];
        this.f8190d = new byte[32];
        int i10 = t0.f16044a;
        this.f8191e = new l0();
        this.f8192f = new l0();
    }
}
