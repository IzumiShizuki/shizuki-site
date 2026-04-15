package hd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements l5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f8447b;

    public q0(int i10) {
        this.f8446a = 1;
        this.f8447b = new ArrayList(i10);
    }

    @Override // l5.a
    public long a(long j10) {
        ArrayList arrayList = this.f8447b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((o6.a) arrayList.get(0)).f16243b) {
            return ((o6.a) arrayList.get(0)).f16243b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            o6.a aVar = (o6.a) arrayList.get(i10);
            long j11 = aVar.f16243b;
            long j12 = aVar.f16243b;
            if (j10 < j11) {
                long j13 = ((o6.a) arrayList.get(i10 - 1)).f16245d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((o6.a) ya.q.k(arrayList)).f16245d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // l5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(o6.a r11, long r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.f8447b
            long r1 = r11.f16243b
            r3 = 0
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L11
            r7 = 1
            goto L12
        L11:
            r7 = 0
        L12:
            p4.c.c(r7)
            int r7 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r7 > 0) goto L25
            long r7 = r11.f16245d
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L23
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 >= 0) goto L25
        L23:
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            int r6 = r0.size()
            int r6 = r6 - r4
        L2b:
            if (r6 < 0) goto L4e
            java.lang.Object r7 = r0.get(r6)
            o6.a r7 = (o6.a) r7
            long r7 = r7.f16243b
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 < 0) goto L3e
            int r6 = r6 + r4
            r0.add(r6, r11)
            return r5
        L3e:
            java.lang.Object r7 = r0.get(r6)
            o6.a r7 = (o6.a) r7
            long r7 = r7.f16243b
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 > 0) goto L4b
            r5 = 0
        L4b:
            int r6 = r6 + (-1)
            goto L2b
        L4e:
            r0.add(r3, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.q0.b(o6.a, long):boolean");
    }

    @Override // l5.a
    public ya.i0 c(long j10) {
        int iP = p(j10);
        if (iP == 0) {
            ya.g0 g0Var = ya.i0.f25998b;
            return ya.a1.f25946e;
        }
        o6.a aVar = (o6.a) this.f8447b.get(iP - 1);
        long j11 = aVar.f16245d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.f16242a;
        }
        ya.g0 g0Var2 = ya.i0.f25998b;
        return ya.a1.f25946e;
    }

    @Override // l5.a
    public void clear() {
        switch (this.f8446a) {
            case 2:
                this.f8447b.clear();
                break;
            default:
                this.f8447b = null;
                break;
        }
    }

    @Override // l5.a
    public long d(long j10) {
        ArrayList arrayList = this.f8447b;
        if (arrayList.isEmpty() || j10 < ((o6.a) arrayList.get(0)).f16243b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((o6.a) arrayList.get(i10)).f16243b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                o6.a aVar = (o6.a) arrayList.get(i10 - 1);
                long j12 = aVar.f16245d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.f16243b : j12;
            }
        }
        o6.a aVar2 = (o6.a) ya.q.k(arrayList);
        long j13 = aVar2.f16245d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.f16243b : j13;
    }

    @Override // l5.a
    public void e(long j10) {
        ArrayList arrayList = this.f8447b;
        int iP = p(j10);
        if (iP == 0) {
            return;
        }
        long j11 = ((o6.a) arrayList.get(iP - 1)).f16245d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iP--;
        }
        arrayList.subList(0, iP).clear();
    }

    public void f(Object obj) {
        this.f8447b.add(obj);
    }

    public void g(String str, String str2) {
        jc.l.e(str2, "value");
        ua.j.n(str);
        ua.j.o(str2, str);
        ua.j.h(this, str, str2);
    }

    public void h(String str) {
        int iV0 = ef.n.v0(str, ':', 1, 4);
        if (iV0 != -1) {
            String strSubstring = str.substring(0, iV0);
            jc.l.d(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iV0 + 1);
            jc.l.d(strSubstring2, "substring(...)");
            ua.j.h(this, strSubstring, strSubstring2);
            return;
        }
        if (str.charAt(0) != ':') {
            ua.j.h(this, "", str);
            return;
        }
        String strSubstring3 = str.substring(1);
        jc.l.d(strSubstring3, "substring(...)");
        ua.j.h(this, "", strSubstring3);
    }

    public void i(Object obj) {
        ArrayList arrayList = this.f8447b;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void j(String str, String str2) {
        jc.l.e(str, "name");
        ua.j.n(str);
        ua.j.h(this, str, str2);
    }

    public ug.r k() {
        return new ug.r((String[]) this.f8447b.toArray(new String[0]));
    }

    public void l() {
        this.f8447b.add(w1.j.f23242c);
    }

    public void m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f8447b.add(new w1.k(f10, f11, f12, f13, f14, f15));
    }

    public void n(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f8447b.add(new w1.s(f10, f11, f12, f13, f14, f15));
    }

    public String o(String str) {
        jc.l.e(str, "name");
        ArrayList arrayList = this.f8447b;
        int size = arrayList.size() - 2;
        int iX = gh.g.x(size, 0, -2);
        if (iX > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iX) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public int p(long j10) {
        ArrayList arrayList = this.f8447b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((o6.a) arrayList.get(i10)).f16243b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public void q(float f10) {
        this.f8447b.add(new w1.l(f10));
    }

    public void r(float f10) {
        this.f8447b.add(new w1.t(f10));
    }

    public void s(float f10, float f11) {
        this.f8447b.add(new w1.m(f10, f11));
    }

    public void t(float f10, float f11) {
        this.f8447b.add(new w1.u(f10, f11));
    }

    public void u(float f10, float f11) {
        this.f8447b.add(new w1.n(f10, f11));
    }

    public void v(float f10, float f11, float f12, float f13) {
        this.f8447b.add(new w1.p(f10, f11, f12, f13));
    }

    public void w(float f10, float f11, float f12, float f13) {
        this.f8447b.add(new w1.x(f10, f11, f12, f13));
    }

    public void x(String str) {
        jc.l.e(str, "name");
        ArrayList arrayList = this.f8447b;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public void y(float f10) {
        this.f8447b.add(new w1.a0(f10));
    }

    public void z(float f10) {
        this.f8447b.add(new w1.z(f10));
    }

    public q0(s0 s0Var) {
        this.f8446a = 0;
        this.f8447b = new ArrayList(1);
    }

    public q0(byte b10, int i10) {
        this.f8446a = i10;
        switch (i10) {
            case 3:
                break;
            case 4:
                this.f8447b = new ArrayList();
                break;
            case 5:
                this.f8447b = new ArrayList(20);
                break;
            case 6:
                this.f8447b = new ArrayList(32);
                break;
            default:
                this.f8447b = new ArrayList();
                break;
        }
    }
}
