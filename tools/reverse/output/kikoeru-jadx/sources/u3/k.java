package u3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f21303a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f21305c;

    public k(View view, f fVar) {
        this.f21304b = view;
        this.f21305c = fVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 w0VarC = w0.c(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        f fVar = this.f21305c;
        if (i10 < 30) {
            l.a(windowInsets, this.f21304b);
            if (w0VarC.equals(this.f21303a)) {
                return fVar.c(view, w0VarC).b();
            }
        }
        this.f21303a = w0VarC;
        w0 w0VarC2 = fVar.c(view, w0VarC);
        if (i10 >= 30) {
            return w0VarC2.b();
        }
        Field field = s.f21328a;
        j.a(view);
        return w0VarC2.b();
    }
}
