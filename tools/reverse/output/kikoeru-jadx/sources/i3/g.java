package i3;

import android.os.Parcelable;
import android.util.SparseArray;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f8949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(q qVar, int i10) {
        super(0);
        this.f8948b = i10;
        this.f8949c = qVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f8948b) {
            case 0:
                this.f8949c.getLayoutNode().C();
                break;
            case 1:
                q qVar = this.f8949c;
                if (qVar.f8954e && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    qVar.getSnapshotObserver().a(qVar, c.f8933c, qVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f8949c.f9000z.saveHierarchyState(sparseArray);
                break;
            case 3:
                q qVar2 = this.f8949c;
                qVar2.getReleaseBlock().a(qVar2.f9000z);
                q.h(qVar2);
                break;
            case 4:
                q qVar3 = this.f8949c;
                qVar3.getResetBlock().a(qVar3.f9000z);
                break;
            default:
                q qVar4 = this.f8949c;
                qVar4.getUpdateBlock().a(qVar4.f9000z);
                break;
        }
        return a0.f21526a;
    }
}
