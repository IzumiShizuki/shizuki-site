package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.cnl.kikoeru.R;
import f8.q;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import o.s;
import o.u0;
import o.v0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f11395f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f11396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f11397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f11398c = new WeakHashMap(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f11399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11400e;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new LinkedHashMap(0, 0.75f, true);
    }

    public static synchronized c c() {
        try {
            if (f11395f == null) {
                c cVar = new c();
                f11395f = cVar;
                g(cVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11395f;
    }

    public static void g(c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.a("vector", new b(3));
            cVar.a("animated-vector", new b(2));
            cVar.a("animated-selector", new b(1));
            cVar.a("drawable", new b(0));
        }
    }

    public final void a(String str, b bVar) {
        if (this.f11396a == null) {
            this.f11396a = new u0(0);
        }
        this.f11396a.put(str, bVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                s sVar = (s) this.f11398c.get(context);
                if (sVar == null) {
                    sVar = new s((Object) null);
                    this.f11398c.put(context, sVar);
                }
                sVar.g(j10, new WeakReference(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Drawable d(Context context, long j10) {
        s sVar = (s) this.f11398c.get(context);
        if (sVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) sVar.d(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            sVar.h(j10);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i10) {
        return f(context, i10);
    }

    public final synchronized Drawable f(Context context, int i10) {
        Drawable drawableH;
        try {
            if (!this.f11400e) {
                this.f11400e = true;
                Drawable drawableE = e(context, R.drawable.abc_vector_test);
                if (drawableE == null || (!(drawableE instanceof q) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                    this.f11400e = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableH = h(context, i10);
            if (drawableH == null) {
                if (this.f11399d == null) {
                    this.f11399d = new TypedValue();
                }
                TypedValue typedValue = this.f11399d;
                context.getResources().getValue(i10, typedValue, true);
                drawableH = d(context, (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data));
                if (drawableH == null) {
                    drawableH = null;
                }
            }
            if (drawableH == null) {
                drawableH = context.getDrawable(i10);
            }
            if (drawableH != null) {
                i(context, i10, drawableH);
            }
            if (drawableH != null) {
                int[] iArr = a.f11392a;
                String name = drawableH.getClass().getName();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
                    int[] state = drawableH.getState();
                    if (state == null || state.length == 0) {
                        drawableH.setState(a.f11392a);
                    } else {
                        drawableH.setState(a.f11393b);
                    }
                    drawableH.setState(state);
                } else if (i11 >= 29 && i11 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state2 = drawableH.getState();
                    if (state2 == null || state2.length == 0) {
                        drawableH.setState(a.f11392a);
                    } else {
                        drawableH.setState(a.f11393b);
                    }
                    drawableH.setState(state2);
                }
            }
        } finally {
        }
        return drawableH;
    }

    public final Drawable h(Context context, int i10) throws Throwable {
        int next;
        u0 u0Var = this.f11396a;
        if (u0Var == null || u0Var.isEmpty()) {
            return null;
        }
        v0 v0Var = this.f11397b;
        if (v0Var != null) {
            String str = (String) v0Var.d(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f11396a.get(str) == null) {
                return null;
            }
        } else {
            this.f11397b = new v0(0);
        }
        if (this.f11399d == null) {
            this.f11399d = new TypedValue();
        }
        TypedValue typedValue = this.f11399d;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableD = d(context, j10);
        if (drawableD != null) {
            return drawableD;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f11397b.a(i10, name);
                b bVar = (b) this.f11396a.get(name);
                if (bVar != null) {
                    drawableD = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableD != null) {
                    drawableD.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, drawableD);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableD == null) {
            this.f11397b.a(i10, "appcompat_skip_skip");
        }
        return drawableD;
    }

    public final Drawable i(Context context, int i10, Drawable drawable) {
        synchronized (this) {
        }
        return drawable;
    }
}
