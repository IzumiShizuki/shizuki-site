package p3;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j extends n7.e {
    public static int L(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily J(s3.f[] fVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (s3.f fVar : fVarArr) {
            if (Objects.equals(fVar.f19375a.getScheme(), "systemfont")) {
                fontBuild = K(fVar);
            } else {
                try {
                    Uri uri = fVar.f19375a;
                    str = fVar.f19379e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fVar.f19377c).setSlant(fVar.f19378d ? 1 : 0).setTtcIndex(fVar.f19376b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font K(s3.f fVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // n7.e
    public final Typeface i(Context context, s3.f[] fVarArr) {
        try {
            FontFamily fontFamilyJ = J(fVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            FontStyle fontStyle = new FontStyle(TinkerReport.KEY_LOADED_SUCC_COST_500_LESS, 0);
            Font font = fontFamilyJ.getFont(0);
            int iL = L(fontStyle, font.getStyle());
            for (int i10 = 1; i10 < fontFamilyJ.getSize(); i10++) {
                Font font2 = fontFamilyJ.getFont(i10);
                int iL2 = L(fontStyle, font2.getStyle());
                if (iL2 < iL) {
                    font = font2;
                    iL = iL2;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // n7.e
    public final Typeface j(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // n7.e
    public final s3.f m(s3.f[] fVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
