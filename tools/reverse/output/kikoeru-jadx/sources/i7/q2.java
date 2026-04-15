package i7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q2 f9274e = new q2(0, vb.r.f22819a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9278d;

    public q2(int[] iArr, List list, int i10, List list2) {
        jc.l.e(iArr, "originalPageOffsets");
        jc.l.e(list, "data");
        this.f9275a = iArr;
        this.f9276b = list;
        this.f9277c = i10;
        this.f9278d = list2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        jc.l.b(list2);
        sb.append(list2.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(list.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q2.class != obj.getClass()) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Arrays.equals(this.f9275a, q2Var.f9275a) && jc.l.a(this.f9276b, q2Var.f9276b) && this.f9277c == q2Var.f9277c && jc.l.a(this.f9278d, q2Var.f9278d);
    }

    public final int hashCode() {
        int iZ = (q.t0.z(Arrays.hashCode(this.f9275a) * 31, 31, this.f9276b) + this.f9277c) * 31;
        List list = this.f9278d;
        return iZ + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f9275a) + ", data=" + this.f9276b + ", hintOriginalPageOffset=" + this.f9277c + ", hintOriginalIndices=" + this.f9278d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q2(int i10, List list) {
        this(new int[]{i10}, list, i10, null);
        jc.l.e(list, "data");
    }
}
