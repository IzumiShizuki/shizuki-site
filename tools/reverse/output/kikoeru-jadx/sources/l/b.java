package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import f8.e;
import f8.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11394a;

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        switch (this.f11394a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) b.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        k.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    } catch (Exception e10) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                } catch (Exception e11) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                    return null;
                }
                break;
            case 2:
                try {
                    Resources resources = context.getResources();
                    e eVar = new e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                } catch (Exception e12) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e12);
                    return null;
                }
                break;
            default:
                try {
                    Resources resources2 = context.getResources();
                    q qVar = new q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                } catch (Exception e13) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
                break;
        }
        return null;
    }
}
