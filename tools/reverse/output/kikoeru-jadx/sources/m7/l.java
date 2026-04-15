package m7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.lifecycle.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14911b;

    public l(s sVar, int i10) {
        this.f14911b = i10;
        new Rect();
        this.f801a = sVar;
    }

    @Override // androidx.lifecycle.q
    public final int c1(View view) {
        int right;
        int i10;
        switch (this.f14911b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f801a).getClass();
                right = view.getRight() + ((t) view.getLayoutParams()).f14931a.right;
                i10 = ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
                break;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f801a).getClass();
                right = view.getBottom() + ((t) view.getLayoutParams()).f14931a.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // androidx.lifecycle.q
    public final int d1(View view) {
        int left;
        int i10;
        switch (this.f14911b) {
            case 0:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f801a).getClass();
                left = view.getLeft() - ((t) view.getLayoutParams()).f14931a.left;
                i10 = ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
                break;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f801a).getClass();
                left = view.getTop() - ((t) view.getLayoutParams()).f14931a.top;
                i10 = ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // androidx.lifecycle.q
    public final int e1() {
        int i10;
        int iT;
        switch (this.f14911b) {
            case 0:
                s sVar = (s) this.f801a;
                i10 = sVar.f14929f;
                iT = sVar.t();
                break;
            default:
                s sVar2 = (s) this.f801a;
                i10 = sVar2.f14930g;
                iT = sVar2.r();
                break;
        }
        return i10 - iT;
    }

    @Override // androidx.lifecycle.q
    public final int f1() {
        switch (this.f14911b) {
            case 0:
                return ((s) this.f801a).s();
            default:
                return ((s) this.f801a).u();
        }
    }

    @Override // androidx.lifecycle.q
    public final int h1() {
        int iS;
        int iT;
        switch (this.f14911b) {
            case 0:
                s sVar = (s) this.f801a;
                iS = sVar.f14929f - sVar.s();
                iT = sVar.t();
                break;
            default:
                s sVar2 = (s) this.f801a;
                iS = sVar2.f14930g - sVar2.u();
                iT = sVar2.r();
                break;
        }
        return iS - iT;
    }
}
