package ya;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f26055j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f26056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f26057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f26060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f26061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient s f26062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient s f26063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient n f26064i;

    public static u a(int i10) {
        u uVar = new u();
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        uVar.f26060e = Math.min(Math.max(i10, 1), 1073741823);
        return uVar;
    }

    public final Map b() {
        Object obj = this.f26056a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f26060e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f26060e += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f26060e = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.f26056a = null;
            this.f26061f = 0;
            return;
        }
        Arrays.fill(i(), 0, this.f26061f, (Object) null);
        Arrays.fill(j(), 0, this.f26061f, (Object) null);
        Object obj = this.f26056a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.f26061f, 0);
        this.f26061f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f26061f; i10++) {
            if (ud.n.f(obj, j()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iS = q.s(obj);
        int iC = c();
        Object obj2 = this.f26056a;
        Objects.requireNonNull(obj2);
        int iT = q.t(iS & iC, obj2);
        if (iT == 0) {
            return -1;
        }
        int i10 = ~iC;
        int i11 = iS & i10;
        do {
            int i12 = iT - 1;
            int i13 = h()[i12];
            if ((i13 & i10) == i11 && ud.n.f(obj, i()[i12])) {
                return i12;
            }
            iT = i13 & iC;
        } while (iT != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f26056a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrI[i10] = null;
            objArrJ[i10] = null;
            iArrH[i10] = 0;
            return;
        }
        Object obj2 = objArrI[i12];
        objArrI[i10] = obj2;
        objArrJ[i10] = objArrJ[i12];
        objArrI[i12] = null;
        objArrJ[i12] = null;
        iArrH[i10] = iArrH[i12];
        iArrH[i12] = 0;
        int iS = q.s(obj2) & i11;
        int iT = q.t(iS, obj);
        if (iT == size) {
            q.u(iS, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iT - 1;
            int i14 = iArrH[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrH[i13] = q.n(i14, i10 + 1, i11);
                return;
            }
            iT = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.f26063h;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.f26063h = sVar2;
        return sVar2;
    }

    public final boolean f() {
        return this.f26056a == null;
    }

    public final Object g(Object obj) {
        if (!f()) {
            int iC = c();
            Object obj2 = this.f26056a;
            Objects.requireNonNull(obj2);
            int iP = q.p(obj, null, iC, obj2, h(), i(), null);
            if (iP != -1) {
                Object obj3 = j()[iP];
                e(iP, iC);
                this.f26061f--;
                this.f26060e += 32;
                return obj3;
            }
        }
        return f26055j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.f26057b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.f26058c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f26059d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i10, int i11, int i12, int i13) {
        Object objE = q.e(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            q.u(i12 & i14, i13 + 1, objE);
        }
        Object obj = this.f26056a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iT = q.t(i15, obj);
            while (iT != 0) {
                int i16 = iT - 1;
                int i17 = iArrH[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iT2 = q.t(i19, objE);
                q.u(i19, iT, objE);
                iArrH[i16] = q.n(i18, iT2, i14);
                iT = i17 & i10;
            }
        }
        this.f26056a = objE;
        this.f26060e = q.n(this.f26060e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.f26062g;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.f26062g = sVar2;
        return sVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0105 -> B:41:0x00eb). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f26055j) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f26061f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.f26064i;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(1, this);
        this.f26064i = nVar2;
        return nVar2;
    }
}
