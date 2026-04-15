package j2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9722a;

    public /* synthetic */ a3(int i10) {
        this.f9722a = i10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f9722a) {
            case 0:
                jc.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline outlineB = ((b3) view).f9741e.b();
                jc.l.b(outlineB);
                outline.set(outlineB);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof t1.m) && (outline2 = ((t1.m) view).f20248e) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
        }
    }
}
