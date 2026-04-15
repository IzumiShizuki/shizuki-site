package androidx.compose.ui.input.pointer;

import c2.j0;
import i2.a1;
import j1.p;
import java.util.Arrays;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Li2/a1;", "Lc2/j0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendPointerInputElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f710d;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10) {
        obj = (i10 & 1) != 0 ? null : obj;
        obj2 = (i10 & 2) != 0 ? null : obj2;
        objArr = (i10 & 4) != 0 ? null : objArr;
        this.f707a = obj;
        this.f708b = obj2;
        this.f709c = objArr;
        this.f710d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        Object[] objArr = suspendPointerInputElement.f709c;
        if (!l.a(this.f707a, suspendPointerInputElement.f707a) || !l.a(this.f708b, suspendPointerInputElement.f708b)) {
            return false;
        }
        Object[] objArr2 = this.f709c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f710d == suspendPointerInputElement.f710d;
    }

    @Override // i2.a1
    public final p h() {
        return new j0(this.f707a, this.f708b, this.f709c, this.f710d);
    }

    public final int hashCode() {
        Object obj = this.f707a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f708b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f709c;
        return this.f710d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        j0 j0Var = (j0) pVar;
        Object obj = j0Var.f3296o;
        Object obj2 = this.f707a;
        boolean z10 = !l.a(obj, obj2);
        j0Var.f3296o = obj2;
        Object obj3 = j0Var.f3297p;
        Object obj4 = this.f708b;
        if (!l.a(obj3, obj4)) {
            z10 = true;
        }
        j0Var.f3297p = obj4;
        Object[] objArr = j0Var.f3298q;
        Object[] objArr2 = this.f709c;
        if (objArr != null && objArr2 == null) {
            z10 = true;
        }
        if (objArr == null && objArr2 != null) {
            z10 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z10 = true;
        }
        j0Var.f3298q = objArr2;
        Class<?> cls = j0Var.f3299r.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f710d;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            j0Var.D0();
        }
        j0Var.f3299r = pointerInputEventHandler;
    }
}
