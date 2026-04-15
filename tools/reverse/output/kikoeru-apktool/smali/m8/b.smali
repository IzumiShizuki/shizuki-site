.class public final Lm8/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lm8/g;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:Ls8/m;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;Ls8/m;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm8/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm8/b;->b:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p2, p0, Lm8/b;->c:Ls8/m;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Lyb/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p1, p0, Lm8/b;->a:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lm8/b;->b:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, p0, Lm8/b;->c:Ls8/m;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Lj8/f;->c:Lj8/f;

    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v6, "Invalid android.resource URI: "

    .line 20
    .line 21
    if-eqz p1, :cond_d

    .line 22
    .line 23
    invoke-static {p1}, Lef/n;->y0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    :cond_0
    if-eqz v1, :cond_d

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lvb/m;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p1, :cond_c

    .line 43
    .line 44
    invoke-static {p1}, Lef/u;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_c

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v2, v3, Ls8/m;->a:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    :goto_0
    new-instance v7, Landroid/util/TypedValue;

    .line 80
    .line 81
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, p1, v7, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 85
    .line 86
    .line 87
    iget-object v7, v7, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 88
    .line 89
    const/16 v8, 0x2f

    .line 90
    .line 91
    const/4 v9, 0x6

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-static {v7, v8, v10, v9}, Lef/n;->A0(Ljava/lang/CharSequence;CII)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-interface {v7, v8, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-static {v8, v7}, Lx8/d;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    const-string v8, "text/xml"

    .line 118
    .line 119
    invoke-static {v7, v8}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_b

    .line 124
    .line 125
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_2

    .line 134
    .line 135
    invoke-static {v2, p1}, Lua/j;->l(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_3

    .line 140
    :cond_2
    invoke-virtual {v6, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    :goto_1
    if-eq v7, v0, :cond_3

    .line 149
    .line 150
    if-eq v7, v4, :cond_3

    .line 151
    .line 152
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    goto :goto_1

    .line 157
    :cond_3
    if-ne v7, v0, :cond_a

    .line 158
    .line 159
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 160
    .line 161
    const/16 v7, 0x18

    .line 162
    .line 163
    if-ge v0, v7, :cond_5

    .line 164
    .line 165
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v7, "vector"

    .line 170
    .line 171
    invoke-static {v0, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_4

    .line 176
    .line 177
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-instance v7, Lf8/q;

    .line 186
    .line 187
    invoke-direct {v7}, Lf8/q;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v6, v1, p1, v0}, Lf8/q;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 191
    .line 192
    .line 193
    :goto_2
    move-object p1, v7

    .line 194
    goto :goto_3

    .line 195
    :cond_4
    const-string v7, "animated-vector"

    .line 196
    .line 197
    invoke-static {v0, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_5

    .line 202
    .line 203
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v7, Lf8/e;

    .line 212
    .line 213
    invoke-direct {v7, v2}, Lf8/e;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v6, v1, p1, v0}, Lf8/e;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    sget v1, Lo3/d;->a:I

    .line 225
    .line 226
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    move-object p1, v0

    .line 233
    :goto_3
    nop

    .line 234
    instance-of v0, p1, Landroid/graphics/drawable/VectorDrawable;

    .line 235
    .line 236
    if-nez v0, :cond_7

    .line 237
    .line 238
    instance-of v0, p1, Lf8/q;

    .line 239
    .line 240
    if-eqz v0, :cond_6

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_6
    const/4 v4, 0x0

    .line 244
    :cond_7
    :goto_4
    new-instance v0, Lm8/d;

    .line 245
    .line 246
    if-eqz v4, :cond_8

    .line 247
    .line 248
    iget-object v1, v3, Ls8/m;->b:Landroid/graphics/Bitmap$Config;

    .line 249
    .line 250
    iget-object v6, v3, Ls8/m;->d:Lt8/h;

    .line 251
    .line 252
    iget-object v7, v3, Ls8/m;->e:Lt8/g;

    .line 253
    .line 254
    iget-boolean v3, v3, Ls8/m;->f:Z

    .line 255
    .line 256
    invoke-static {p1, v1, v6, v7, v3}, Lvb/w;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lt8/h;Lt8/g;Z)Landroid/graphics/Bitmap;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 265
    .line 266
    invoke-direct {v2, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 267
    .line 268
    .line 269
    move-object p1, v2

    .line 270
    :cond_8
    invoke-direct {v0, p1, v4, v5}, Lm8/d;-><init>(Landroid/graphics/drawable/Drawable;ZLj8/f;)V

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_9
    const-string v0, "Invalid resource ID: "

    .line 275
    .line 276
    invoke-static {p1, v0}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :cond_a
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 291
    .line 292
    const-string v0, "No start tag found."

    .line 293
    .line 294
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p1

    .line 298
    :cond_b
    new-instance v0, Landroid/util/TypedValue;

    .line 299
    .line 300
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    new-instance v1, Lm8/m;

    .line 308
    .line 309
    invoke-static {p1}, Lg8/a;->Z(Ljava/io/InputStream;)Llh/s;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {p1}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    new-instance v2, Lj8/o;

    .line 318
    .line 319
    iget v0, v0, Landroid/util/TypedValue;->density:I

    .line 320
    .line 321
    invoke-direct {v2, v0}, Lj8/o;-><init>(I)V

    .line 322
    .line 323
    .line 324
    new-instance v0, Lj8/p;

    .line 325
    .line 326
    invoke-direct {v0, p1, v2}, Lj8/p;-><init>(Llh/h;Llc/b;)V

    .line 327
    .line 328
    .line 329
    invoke-direct {v1, v0, v7, v5}, Lm8/m;-><init>(Lj8/n;Ljava/lang/String;Lj8/f;)V

    .line 330
    .line 331
    .line 332
    move-object v0, v1

    .line 333
    :goto_5
    return-object v0

    .line 334
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw p1

    .line 352
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 353
    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    .line 355
    .line 356
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw p1

    .line 370
    :pswitch_0
    iget-object p1, v3, Ls8/m;->a:Landroid/content/Context;

    .line 371
    .line 372
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-virtual {v2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    const-string v7, "com.android.contacts"

    .line 381
    .line 382
    invoke-static {v6, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    const-string v7, "\'."

    .line 387
    .line 388
    if-eqz v6, :cond_10

    .line 389
    .line 390
    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    const-string v8, "display_photo"

    .line 395
    .line 396
    invoke-static {v6, v8}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    if-eqz v6, :cond_10

    .line 401
    .line 402
    const-string v0, "r"

    .line 403
    .line 404
    invoke-virtual {p1, v2, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-eqz v0, :cond_e

    .line 409
    .line 410
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    :cond_e
    if-eqz v1, :cond_f

    .line 415
    .line 416
    goto/16 :goto_a

    .line 417
    .line 418
    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v0, "Unable to find a contact photo associated with \'"

    .line 421
    .line 422
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 436
    .line 437
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v0

    .line 445
    :cond_10
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 446
    .line 447
    const/16 v8, 0x1d

    .line 448
    .line 449
    if-lt v6, v8, :cond_17

    .line 450
    .line 451
    invoke-virtual {v2}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    const-string v8, "media"

    .line 456
    .line 457
    invoke-static {v6, v8}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    if-nez v6, :cond_11

    .line 462
    .line 463
    goto/16 :goto_9

    .line 464
    .line 465
    :cond_11
    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    const/4 v9, 0x3

    .line 474
    if-lt v8, v9, :cond_17

    .line 475
    .line 476
    add-int/lit8 v9, v8, -0x3

    .line 477
    .line 478
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    const-string v10, "audio"

    .line 483
    .line 484
    invoke-static {v9, v10}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    if-eqz v9, :cond_17

    .line 489
    .line 490
    sub-int/2addr v8, v0

    .line 491
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    const-string v6, "albums"

    .line 496
    .line 497
    invoke-static {v0, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_17

    .line 502
    .line 503
    iget-object v0, v3, Ls8/m;->d:Lt8/h;

    .line 504
    .line 505
    iget-object v3, v0, Lt8/h;->a:Lnh/a;

    .line 506
    .line 507
    instance-of v6, v3, Lt8/a;

    .line 508
    .line 509
    if-eqz v6, :cond_12

    .line 510
    .line 511
    check-cast v3, Lt8/a;

    .line 512
    .line 513
    goto :goto_6

    .line 514
    :cond_12
    move-object v3, v1

    .line 515
    :goto_6
    if-eqz v3, :cond_14

    .line 516
    .line 517
    iget v3, v3, Lt8/a;->q:I

    .line 518
    .line 519
    iget-object v0, v0, Lt8/h;->b:Lnh/a;

    .line 520
    .line 521
    instance-of v6, v0, Lt8/a;

    .line 522
    .line 523
    if-eqz v6, :cond_13

    .line 524
    .line 525
    check-cast v0, Lt8/a;

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_13
    move-object v0, v1

    .line 529
    :goto_7
    if-eqz v0, :cond_14

    .line 530
    .line 531
    iget v0, v0, Lt8/a;->q:I

    .line 532
    .line 533
    new-instance v6, Landroid/os/Bundle;

    .line 534
    .line 535
    invoke-direct {v6, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 536
    .line 537
    .line 538
    new-instance v4, Landroid/graphics/Point;

    .line 539
    .line 540
    invoke-direct {v4, v3, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 541
    .line 542
    .line 543
    const-string v0, "android.content.extra.SIZE"

    .line 544
    .line 545
    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 546
    .line 547
    .line 548
    goto :goto_8

    .line 549
    :cond_14
    move-object v6, v1

    .line 550
    :goto_8
    invoke-static {p1, v2, v6}, Lj2/l2;->e(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    if-eqz v0, :cond_15

    .line 555
    .line 556
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    :cond_15
    if-eqz v1, :cond_16

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const-string v0, "Unable to find a music thumbnail associated with \'"

    .line 566
    .line 567
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 581
    .line 582
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object p1

    .line 586
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    throw v0

    .line 590
    :cond_17
    :goto_9
    invoke-virtual {p1, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    if-eqz v1, :cond_18

    .line 595
    .line 596
    :goto_a
    new-instance v0, Lm8/m;

    .line 597
    .line 598
    invoke-static {v1}, Lg8/a;->Z(Ljava/io/InputStream;)Llh/s;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-static {v1}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    new-instance v3, Lj8/a;

    .line 607
    .line 608
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 609
    .line 610
    .line 611
    new-instance v4, Lj8/p;

    .line 612
    .line 613
    invoke-direct {v4, v1, v3}, Lj8/p;-><init>(Llh/h;Llc/b;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {p1, v2}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    invoke-direct {v0, v4, p1, v5}, Lm8/m;-><init>(Lj8/n;Ljava/lang/String;Lj8/f;)V

    .line 621
    .line 622
    .line 623
    return-object v0

    .line 624
    :cond_18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    const-string v0, "Unable to open \'"

    .line 627
    .line 628
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 642
    .line 643
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    throw v0

    .line 651
    :pswitch_1
    invoke-virtual {v2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    check-cast p1, Ljava/lang/Iterable;

    .line 656
    .line 657
    invoke-static {p1, v4}, Lvb/m;->V(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object p1

    .line 661
    move-object v6, p1

    .line 662
    check-cast v6, Ljava/lang/Iterable;

    .line 663
    .line 664
    const/4 v10, 0x0

    .line 665
    const/16 v11, 0x3e

    .line 666
    .line 667
    const-string v7, "/"

    .line 668
    .line 669
    const/4 v8, 0x0

    .line 670
    const/4 v9, 0x0

    .line 671
    invoke-static/range {v6 .. v11}, Lvb/m;->f0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/k;I)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object p1

    .line 675
    new-instance v0, Lm8/m;

    .line 676
    .line 677
    iget-object v1, v3, Ls8/m;->a:Landroid/content/Context;

    .line 678
    .line 679
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-static {v1}, Lg8/a;->Z(Ljava/io/InputStream;)Llh/s;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    invoke-static {v1}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    new-instance v2, Lj8/a;

    .line 696
    .line 697
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 698
    .line 699
    .line 700
    new-instance v3, Lj8/p;

    .line 701
    .line 702
    invoke-direct {v3, v1, v2}, Lj8/p;-><init>(Llh/h;Llc/b;)V

    .line 703
    .line 704
    .line 705
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-static {v1, p1}, Lx8/d;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    invoke-direct {v0, v3, p1, v5}, Lm8/m;-><init>(Lj8/n;Ljava/lang/String;Lj8/f;)V

    .line 714
    .line 715
    .line 716
    return-object v0

    .line 717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
