package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c7.p0;
import java.lang.reflect.InvocationTargetException;
import m3.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f739k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f749j;

    public IconCompat() {
        this.f740a = -1;
        this.f742c = null;
        this.f743d = null;
        this.f744e = 0;
        this.f745f = 0;
        this.f746g = null;
        this.f747h = f739k;
        this.f748i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Context context, int i10) {
        context.getClass();
        return c(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f744e = i10;
        if (resources != null) {
            try {
                iconCompat.f741b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f741b = str;
        }
        iconCompat.f749j = str;
        return iconCompat;
    }

    public final int d() {
        int i10;
        int i11 = this.f740a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 == 2) {
                return this.f744e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f741b;
        if (i10 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public final Uri e() {
        int i10;
        int i11 = this.f740a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 == 4 || i11 == 6) {
                return Uri.parse((String) this.f741b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f741b;
        if (i10 >= 28) {
            return e.j(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public final Icon f(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return p0.u(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f740a == -1) {
            return String.valueOf(this.f741b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f740a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f740a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f741b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f741b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f749j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f744e);
                if (this.f745f != 0) {
                    sb.append(" off=");
                    sb.append(this.f745f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f741b);
                break;
        }
        if (this.f746g != null) {
            sb.append(" tint=");
            sb.append(this.f746g);
        }
        if (this.f747h != f739k) {
            sb.append(" mode=");
            sb.append(this.f747h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f742c = null;
        this.f743d = null;
        this.f744e = 0;
        this.f745f = 0;
        this.f746g = null;
        this.f747h = f739k;
        this.f748i = null;
        this.f740a = i10;
    }
}
