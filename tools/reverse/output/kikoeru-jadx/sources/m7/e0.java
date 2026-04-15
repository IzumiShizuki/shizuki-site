package m7;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import i7.j1;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f14839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f14840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14843g;

    public e0(RecyclerView recyclerView) {
        this.f14843g = recyclerView;
        m mVar = RecyclerView.C0;
        this.f14840d = mVar;
        this.f14841e = false;
        this.f14842f = false;
        this.f14839c = new OverScroller(recyclerView.getContext(), mVar);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f14843g;
        recyclerView.setScrollState(2);
        this.f14838b = 0;
        this.f14837a = 0;
        Interpolator interpolator = this.f14840d;
        m mVar = RecyclerView.C0;
        if (interpolator != mVar) {
            this.f14840d = mVar;
            this.f14839c = new OverScroller(recyclerView.getContext(), mVar);
        }
        this.f14839c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f14841e) {
            this.f14842f = true;
            return;
        }
        recyclerView.removeCallbacks(this);
        Field field = u3.s.f21328a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f14843g;
        int[] iArr = recyclerView.f1049v0;
        if (recyclerView.f1033j == null) {
            recyclerView.removeCallbacks(this);
            this.f14839c.abortAnimation();
            return;
        }
        this.f14842f = false;
        this.f14841e = true;
        recyclerView.e();
        OverScroller overScroller = this.f14839c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f14837a;
            int i11 = currY - this.f14838b;
            this.f14837a = currX;
            this.f14838b = currY;
            int iD = RecyclerView.d(i10, recyclerView.A, recyclerView.C, recyclerView.getWidth());
            int iD2 = RecyclerView.d(i11, recyclerView.B, recyclerView.D, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f1049v0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.g(iD, iD2, 1, iArr2, null)) {
                iD -= iArr[0];
                iD2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(iD, iD2);
            }
            if (!recyclerView.f1034k.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1049v0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.h(iD, iD2, 1, null, iArr3);
            int i12 = iD - iArr[0];
            int i13 = iD2 - iArr[1];
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            recyclerView.f1033j.getClass();
            if (z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.j();
                        if (recyclerView.A.isFinished()) {
                            recyclerView.A.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.k();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.l();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.i();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        Field field = u3.s.f21328a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.A0) {
                    j1 j1Var = recyclerView.U;
                    j1Var.getClass();
                    j1Var.f9178c = 0;
                }
            } else {
                if (this.f14841e) {
                    this.f14842f = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    Field field2 = u3.s.f21328a;
                    recyclerView.postOnAnimation(this);
                }
                h hVar = recyclerView.T;
                if (hVar != null) {
                    hVar.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f1033j.getClass();
        this.f14841e = false;
        if (!this.f14842f) {
            recyclerView.setScrollState(0);
            recyclerView.A(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field3 = u3.s.f21328a;
            recyclerView.postOnAnimation(this);
        }
    }
}
