package j2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements y1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f9910b;

    public /* synthetic */ m1(View view, int i10) {
        this.f9909a = i10;
        this.f9910b = view;
    }

    @Override // y1.a
    public final void a(int i10) {
        switch (this.f9909a) {
            case 0:
                View view = this.f9910b;
                if (i10 == 16) {
                    view.performHapticFeedback(16);
                } else if (i10 == 6) {
                    view.performHapticFeedback(6);
                } else if (i10 == 13) {
                    view.performHapticFeedback(13);
                } else if (i10 == 23) {
                    view.performHapticFeedback(23);
                } else if (i10 == 3) {
                    view.performHapticFeedback(3);
                } else if (i10 == 0) {
                    view.performHapticFeedback(0);
                } else if (i10 == 17) {
                    view.performHapticFeedback(17);
                } else if (i10 == 27) {
                    view.performHapticFeedback(27);
                } else if (i10 == 26) {
                    view.performHapticFeedback(26);
                } else if (i10 == 9) {
                    view.performHapticFeedback(9);
                } else if (i10 == 22) {
                    view.performHapticFeedback(22);
                } else if (i10 == 21) {
                    view.performHapticFeedback(21);
                } else if (i10 == 1) {
                    view.performHapticFeedback(1);
                }
                break;
            default:
                v vVar = (v) this.f9910b;
                if (i10 == 16) {
                    vVar.performHapticFeedback(16);
                } else if (i10 == 6) {
                    vVar.performHapticFeedback(6);
                } else if (i10 == 13) {
                    vVar.performHapticFeedback(13);
                } else if (i10 == 23) {
                    vVar.performHapticFeedback(23);
                } else if (i10 == 3) {
                    vVar.performHapticFeedback(3);
                } else if (i10 == 0) {
                    vVar.performHapticFeedback(0);
                } else if (i10 == 17) {
                    vVar.performHapticFeedback(17);
                } else if (i10 == 27) {
                    vVar.performHapticFeedback(27);
                } else if (i10 == 26) {
                    vVar.performHapticFeedback(26);
                } else if (i10 == 9) {
                    vVar.performHapticFeedback(9);
                } else if (i10 == 22) {
                    vVar.performHapticFeedback(22);
                } else if (i10 == 21) {
                    vVar.performHapticFeedback(21);
                } else if (i10 == 1) {
                    vVar.performHapticFeedback(1);
                }
                break;
        }
    }
}
