.class public final synthetic La9/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La9/g;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, La9/g;->a:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const-string v3, "Not Provide"

    .line 6
    .line 7
    const-string v4, ""

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 11
    .line 12
    const-class v7, Ljava/lang/String;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v11, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_0
    new-instance v0, Lq9/i0;

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    invoke-direct {v0, v1}, Lq9/i0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    :try_start_0
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    .line 39
    .line 40
    const-string v1, "mServedView"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 47
    .line 48
    .line 49
    const-string v2, "mNextServedView"

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    const-string v3, "mH"

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Ld/z;

    .line 68
    .line 69
    invoke-direct {v3, v0, v1, v2}, Ld/z;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    sget-object v3, Ld/y;->a:Ld/y;

    .line 74
    .line 75
    :goto_0
    return-object v3

    .line 76
    :pswitch_2
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroidx/lifecycle/q;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/lifecycle/q;->o1()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    xor-int/2addr v0, v10

    .line 87
    invoke-static {v0}, Lh9/d;->f(Z)V

    .line 88
    .line 89
    .line 90
    return-object v6

    .line 91
    :pswitch_3
    sget-object v0, Lh9/d;->d:Lx0/e1;

    .line 92
    .line 93
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    invoke-static {}, Ln7/e;->u()Lw1/f;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_1

    .line 110
    :cond_0
    invoke-static {}, Lnh/a;->r()Lw1/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_1
    return-object v0

    .line 115
    :pswitch_4
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "subtitle.txt"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :try_start_1
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lef/a;->a:Ljava/nio/charset/Charset;

    .line 133
    .line 134
    new-instance v2, Ljava/io/InputStreamReader;

    .line 135
    .line 136
    invoke-direct {v2, v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Landroid/support/v4/media/session/b;->V(Ljava/io/InputStreamReader;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 144
    .line 145
    .line 146
    const-string v1, "\n"

    .line 147
    .line 148
    filled-new-array {v1}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v0, v1}, Lef/n;->K0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-object v2, v0

    .line 159
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    invoke-static {v1, v2}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :pswitch_5
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v0, v0, Lcom/cnl/kikoeru/data/db/AppDatabase;->l:Lub/p;

    .line 170
    .line 171
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move-object v3, v0

    .line 176
    check-cast v3, Ld9/x;

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v2, Ln7/w;

    .line 182
    .line 183
    new-instance v0, Lm0/l3;

    .line 184
    .line 185
    const/16 v1, 0xa

    .line 186
    .line 187
    invoke-direct {v0, v1}, Lm0/l3;-><init>(I)V

    .line 188
    .line 189
    .line 190
    const-string v1, "SELECT content FROM SearchHistoryBean ORDER BY timestamp DESC"

    .line 191
    .line 192
    invoke-direct {v2, v1, v0}, Ln7/w;-><init>(Ljava/lang/String;Lic/k;)V

    .line 193
    .line 194
    .line 195
    iget-object v4, v3, Ld9/x;->a:Ln7/v;

    .line 196
    .line 197
    const-string v0, "SearchHistoryBean"

    .line 198
    .line 199
    filled-new-array {v0}, [Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    new-instance v1, Ld9/f;

    .line 204
    .line 205
    const/4 v6, 0x4

    .line 206
    invoke-direct/range {v1 .. v6}, Ld9/f;-><init>(Ln7/w;Ljava/lang/Object;Ln7/v;[Ljava/lang/String;I)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :pswitch_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v3, "searchTranslate"

    .line 221
    .line 222
    invoke-static {v3, v0, v1, v11, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0

    .line 227
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const-string v3, "searchSubtitle"

    .line 238
    .line 239
    invoke-static {v3, v0, v1, v11, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :pswitch_8
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-class v1, Lbg/u;

    .line 249
    .line 250
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const-string v2, "searchSort"

    .line 255
    .line 256
    sget-object v3, Lbg/u;->a:Lbg/u;

    .line 257
    .line 258
    invoke-static {v2, v3, v0, v11, v1}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :pswitch_9
    invoke-static {}, Lg9/a;->b()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_1

    .line 268
    .line 269
    sget-object v0, Lbg/e2;->b:Lbg/e2;

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_1
    sget-object v0, Lbg/e2;->a:Lbg/e2;

    .line 273
    .line 274
    :goto_2
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    const-class v2, Lbg/e2;

    .line 279
    .line 280
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const-string v3, "searchOrder"

    .line 285
    .line 286
    invoke-static {v3, v0, v1, v11, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :pswitch_a
    new-instance v0, Ljava/io/File;

    .line 292
    .line 293
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v2, "metadata"

    .line 302
    .line 303
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v0}, Lna/c;->d(Ljava/io/File;)V

    .line 307
    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_b
    :try_start_3
    sget-object v0, Lb8/b;->c:Ljava/lang/Object;

    .line 311
    .line 312
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Ljava/lang/reflect/Method;

    .line 317
    .line 318
    if-eqz v0, :cond_2

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v0, :cond_2

    .line 325
    .line 326
    const-string v1, "beginTransaction"

    .line 327
    .line 328
    const/4 v2, 0x4

    .line 329
    new-array v2, v2, [Ljava/lang/Class;

    .line 330
    .line 331
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 332
    .line 333
    aput-object v3, v2, v11

    .line 334
    .line 335
    const-class v4, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 336
    .line 337
    aput-object v4, v2, v10

    .line 338
    .line 339
    aput-object v3, v2, v5

    .line 340
    .line 341
    const-class v3, Landroid/os/CancellationSignal;

    .line 342
    .line 343
    const/4 v4, 0x3

    .line 344
    aput-object v3, v2, v4

    .line 345
    .line 346
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 347
    .line 348
    .line 349
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 350
    :catchall_2
    :cond_2
    return-object v8

    .line 351
    :pswitch_c
    :try_start_4
    const-class v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 352
    .line 353
    const-string v1, "getThreadSession"

    .line 354
    .line 355
    invoke-virtual {v0, v1, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 360
    .line 361
    .line 362
    move-object v8, v0

    .line 363
    :catchall_3
    return-object v8

    .line 364
    :pswitch_d
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-static {v7}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    const-string v2, "defaultBackground"

    .line 373
    .line 374
    invoke-static {v0, v2, v4, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0, v4}, Lhg/b;->d(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Lka/b;->f:Lx0/p1;

    .line 382
    .line 383
    if-eqz v0, :cond_3

    .line 384
    .line 385
    invoke-virtual {v0}, Lx0/p1;->c()V

    .line 386
    .line 387
    .line 388
    :cond_3
    return-object v6

    .line 389
    :pswitch_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 390
    .line 391
    const-string v1, "AppNavController Not Provide"

    .line 392
    .line 393
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v0

    .line 397
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :pswitch_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 404
    .line 405
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :pswitch_11
    new-instance v0, Lef/l;

    .line 410
    .line 411
    const-string v1, "https://.+/api/cover/RJ(\\d{6,8}).+"

    .line 412
    .line 413
    invoke-direct {v0, v1}, Lef/l;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    sget v1, Lff/a;->d:I

    .line 417
    .line 418
    const/16 v1, 0x1e

    .line 419
    .line 420
    sget-object v2, Lff/c;->g:Lff/c;

    .line 421
    .line 422
    invoke-static {v1, v2}, Lff/f;->m(ILff/c;)J

    .line 423
    .line 424
    .line 425
    move-result-wide v1

    .line 426
    sget-object v3, Lff/c;->d:Lff/c;

    .line 427
    .line 428
    invoke-static {v1, v2, v3}, Lff/a;->h(JLff/c;)J

    .line 429
    .line 430
    .line 431
    move-result-wide v1

    .line 432
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    new-instance v2, Lug/w;

    .line 437
    .line 438
    invoke-direct {v2}, Lug/w;-><init>()V

    .line 439
    .line 440
    .line 441
    new-instance v3, La9/h;

    .line 442
    .line 443
    invoke-direct {v3, v11, v0}, La9/h;-><init>(ILjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v0, v2, Lug/w;->c:Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    new-instance v0, La9/h;

    .line 452
    .line 453
    invoke-direct {v0, v10, v1}, La9/h;-><init>(ILjava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    iget-object v1, v2, Lug/w;->d:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    new-instance v0, Lug/x;

    .line 462
    .line 463
    invoke-direct {v0, v2}, Lug/x;-><init>(Lug/w;)V

    .line 464
    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_12
    new-instance v0, Lb7/b1;

    .line 468
    .line 469
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-direct {v0, v1}, Lb7/b1;-><init>(Landroid/content/Context;)V

    .line 474
    .line 475
    .line 476
    new-instance v1, La9/g;

    .line 477
    .line 478
    const/16 v2, 0xb

    .line 479
    .line 480
    invoke-direct {v1, v2}, La9/g;-><init>(I)V

    .line 481
    .line 482
    .line 483
    invoke-static {v1}, Lub/a;->d(Lic/a;)Lub/p;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    iput-object v1, v0, Lb7/b1;->f:Ljava/lang/Object;

    .line 488
    .line 489
    new-instance v1, La9/g;

    .line 490
    .line 491
    invoke-direct {v1, v10}, La9/g;-><init>(I)V

    .line 492
    .line 493
    .line 494
    invoke-static {v1}, Lub/a;->d(Lic/a;)Lub/p;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    iput-object v1, v0, Lb7/b1;->d:Ljava/lang/Object;

    .line 499
    .line 500
    new-instance v1, La9/g;

    .line 501
    .line 502
    invoke-direct {v1, v5}, La9/g;-><init>(I)V

    .line 503
    .line 504
    .line 505
    invoke-static {v1}, Lub/a;->d(Lic/a;)Lub/p;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    iput-object v1, v0, Lb7/b1;->e:Ljava/lang/Object;

    .line 510
    .line 511
    invoke-virtual {v0}, Lb7/b1;->n()Lh8/h;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    :pswitch_13
    invoke-static {}, Lhf/a0;->d()Lnf/d;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    return-object v0

    .line 521
    :pswitch_14
    sget-object v0, Lcom/cnl/kikoeru/MainApplication;->c:Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 522
    .line 523
    if-eqz v0, :cond_4

    .line 524
    .line 525
    return-object v0

    .line 526
    :cond_4
    const-string v0, "DATABASE"

    .line 527
    .line 528
    invoke-static {v0}, Ljc/l;->k(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    throw v8

    .line 532
    :pswitch_15
    sget-object v0, Lcom/cnl/kikoeru/MainApplication;->a:Lcom/cnl/kikoeru/MainApplication;

    .line 533
    .line 534
    if-eqz v0, :cond_5

    .line 535
    .line 536
    return-object v0

    .line 537
    :cond_5
    const-string v0, "INSTANCE"

    .line 538
    .line 539
    invoke-static {v0}, Ljc/l;->k(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v8

    .line 543
    :pswitch_16
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 544
    .line 545
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const-string v3, "forceSoftwareDecode"

    .line 554
    .line 555
    invoke-static {v1, v3, v0, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    return-object v0

    .line 560
    :pswitch_17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 561
    .line 562
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const-string v3, "refreshFavPage"

    .line 571
    .line 572
    invoke-static {v3, v0, v1, v11, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    return-object v0

    .line 577
    :pswitch_18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 578
    .line 579
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const-string v3, "refreshRepoPage"

    .line 588
    .line 589
    invoke-static {v3, v0, v1, v11, v2}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    return-object v0

    .line 594
    :pswitch_19
    const/16 v0, 0x10

    .line 595
    .line 596
    new-array v0, v0, [B

    .line 597
    .line 598
    sget-object v3, Lgf/a;->a:Ljava/security/SecureRandom;

    .line 599
    .line 600
    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 601
    .line 602
    .line 603
    const/4 v3, 0x6

    .line 604
    aget-byte v4, v0, v3

    .line 605
    .line 606
    and-int/lit8 v4, v4, 0xf

    .line 607
    .line 608
    int-to-byte v4, v4

    .line 609
    aput-byte v4, v0, v3

    .line 610
    .line 611
    or-int/lit8 v4, v4, 0x40

    .line 612
    .line 613
    int-to-byte v4, v4

    .line 614
    aput-byte v4, v0, v3

    .line 615
    .line 616
    const/16 v3, 0x8

    .line 617
    .line 618
    aget-byte v4, v0, v3

    .line 619
    .line 620
    and-int/lit8 v4, v4, 0x3f

    .line 621
    .line 622
    int-to-byte v4, v4

    .line 623
    aput-byte v4, v0, v3

    .line 624
    .line 625
    or-int/lit16 v4, v4, 0x80

    .line 626
    .line 627
    int-to-byte v4, v4

    .line 628
    aput-byte v4, v0, v3

    .line 629
    .line 630
    invoke-static {v0, v11}, Llc/b;->y([BI)J

    .line 631
    .line 632
    .line 633
    move-result-wide v4

    .line 634
    invoke-static {v0, v3}, Llc/b;->y([BI)J

    .line 635
    .line 636
    .line 637
    move-result-wide v8

    .line 638
    cmp-long v0, v4, v1

    .line 639
    .line 640
    if-nez v0, :cond_6

    .line 641
    .line 642
    cmp-long v0, v8, v1

    .line 643
    .line 644
    if-nez v0, :cond_6

    .line 645
    .line 646
    sget-object v0, Lgf/b;->c:Lgf/b;

    .line 647
    .line 648
    goto :goto_3

    .line 649
    :cond_6
    new-instance v0, Lgf/b;

    .line 650
    .line 651
    invoke-direct {v0, v4, v5, v8, v9}, Lgf/b;-><init>(JJ)V

    .line 652
    .line 653
    .line 654
    :goto_3
    invoke-virtual {v0}, Lgf/b;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-static {v7}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    const-string v3, "recommenderUuid"

    .line 667
    .line 668
    invoke-static {v1, v3, v0, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    return-object v0

    .line 673
    :pswitch_1a
    sget-object v5, Llh/l;->a:Llh/u;

    .line 674
    .line 675
    sget-object v0, Lhf/l0;->a:Lpf/e;

    .line 676
    .line 677
    sget-object v4, Lpf/d;->c:Lpf/d;

    .line 678
    .line 679
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    const-string v3, "getCacheDir(...)"

    .line 688
    .line 689
    invoke-static {v0, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    const-string v3, "coil_cache"

    .line 693
    .line 694
    invoke-static {v0, v3}, Lfc/b;->i0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sget-object v3, Llh/y;->b:Ljava/lang/String;

    .line 699
    .line 700
    invoke-static {v0}, Lg5/w;->w(Ljava/io/File;)Llh/y;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    sget-object v0, Lna/q;->a:Lub/p;

    .line 705
    .line 706
    int-to-long v7, v10

    .line 707
    const/16 v0, 0x400

    .line 708
    .line 709
    int-to-long v9, v0

    .line 710
    mul-long v7, v7, v9

    .line 711
    .line 712
    mul-long v7, v7, v9

    .line 713
    .line 714
    mul-long v7, v7, v9

    .line 715
    .line 716
    cmp-long v0, v7, v1

    .line 717
    .line 718
    if-lez v0, :cond_8

    .line 719
    .line 720
    const-wide/16 v0, 0x0

    .line 721
    .line 722
    cmpl-double v2, v0, v0

    .line 723
    .line 724
    if-lez v2, :cond_7

    .line 725
    .line 726
    const-wide/32 v11, 0xa00000

    .line 727
    .line 728
    .line 729
    :try_start_5
    invoke-virtual {v6}, Llh/y;->toFile()Ljava/io/File;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    new-instance v3, Landroid/os/StatFs;

    .line 741
    .line 742
    invoke-direct {v3, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 746
    .line 747
    .line 748
    move-result-wide v7

    .line 749
    long-to-double v7, v7

    .line 750
    mul-double v0, v0, v7

    .line 751
    .line 752
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 753
    .line 754
    .line 755
    move-result-wide v2

    .line 756
    long-to-double v2, v2

    .line 757
    mul-double v0, v0, v2

    .line 758
    .line 759
    double-to-long v9, v0

    .line 760
    const-wide/32 v13, 0xfa00000

    .line 761
    .line 762
    .line 763
    invoke-static/range {v9 .. v14}, Lnh/b;->l(JJJ)J

    .line 764
    .line 765
    .line 766
    move-result-wide v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 767
    move-wide v7, v0

    .line 768
    goto :goto_4

    .line 769
    :catch_1
    move-wide v7, v11

    .line 770
    :cond_7
    :goto_4
    move-wide v2, v7

    .line 771
    new-instance v1, Lk8/f;

    .line 772
    .line 773
    invoke-direct/range {v1 .. v6}, Lk8/f;-><init>(JLhf/u;Llh/l;Llh/y;)V

    .line 774
    .line 775
    .line 776
    return-object v1

    .line 777
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 778
    .line 779
    const-string v1, "size must be > 0."

    .line 780
    .line 781
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :pswitch_1b
    new-instance v0, Lq8/a;

    .line 786
    .line 787
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-direct {v0, v1}, Lq8/a;-><init>(Landroid/content/Context;)V

    .line 792
    .line 793
    .line 794
    const-wide/high16 v1, 0x3fd0000000000000L    # 0.25

    .line 795
    .line 796
    iput-wide v1, v0, Lq8/a;->b:D

    .line 797
    .line 798
    invoke-virtual {v0}, Lq8/a;->a()Lq8/d;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    return-object v0

    .line 803
    :pswitch_1c
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-static {v7}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    const-string v2, "token"

    .line 812
    .line 813
    invoke-static {v0, v2, v4, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    return-object v0

    .line 818
    nop

    .line 819
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method
