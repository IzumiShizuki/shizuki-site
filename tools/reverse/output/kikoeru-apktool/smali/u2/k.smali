.class public final Lu2/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public final b:Landroid/text/TextUtils$TruncateAt;

.field public final c:Z

.field public final d:Z

.field public e:Lce/g;

.field public final f:Landroid/text/Layout;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:Landroid/graphics/Paint$FontMetricsInt;

.field public final n:I

.field public final o:[Lw2/h;

.field public final p:Landroid/graphics/Rect;

.field public q:Lch/l;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILu2/f;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    move/from16 v2, p4

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object/from16 v4, p3

    .line 15
    .line 16
    iput-object v4, v1, Lu2/k;->a:Landroid/text/TextPaint;

    .line 17
    .line 18
    move-object/from16 v8, p5

    .line 19
    .line 20
    iput-object v8, v1, Lu2/k;->b:Landroid/text/TextUtils$TruncateAt;

    .line 21
    .line 22
    iput-boolean v7, v1, Lu2/k;->c:Z

    .line 23
    .line 24
    new-instance v5, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v5, v1, Lu2/k;->p:Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static/range {p6 .. p6}, Lu2/l;->a(I)Landroid/text/TextDirectionHeuristic;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    sget-object v6, Lu2/i;->a:Landroid/text/Layout$Alignment;

    .line 40
    .line 41
    const/4 v14, 0x1

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eq v2, v14, :cond_3

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    if-eq v2, v6, :cond_2

    .line 48
    .line 49
    const/4 v6, 0x3

    .line 50
    if-eq v2, v6, :cond_1

    .line 51
    .line 52
    const/4 v6, 0x4

    .line 53
    if-eq v2, v6, :cond_0

    .line 54
    .line 55
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 56
    .line 57
    :goto_0
    move-object v6, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    sget-object v2, Lu2/i;->b:Landroid/text/Layout$Alignment;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v2, Lu2/i;->a:Landroid/text/Layout$Alignment;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    instance-of v2, v3, Landroid/text/Spanned;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    move-object v2, v3

    .line 79
    check-cast v2, Landroid/text/Spanned;

    .line 80
    .line 81
    const/4 v9, -0x1

    .line 82
    const-class v10, Lw2/a;

    .line 83
    .line 84
    invoke-interface {v2, v9, v5, v10}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-ge v2, v5, :cond_5

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 v2, 0x0

    .line 93
    :goto_2
    const-string v5, "TextLayout:initLayout"

    .line 94
    .line 95
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lu2/f;->a()Landroid/text/BoringLayout$Metrics;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    float-to-double v10, v0

    .line 103
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v14

    .line 107
    double-to-float v5, v14

    .line 108
    float-to-int v5, v5

    .line 109
    const/16 v14, 0x21

    .line 110
    .line 111
    if-eqz v9, :cond_9

    .line 112
    .line 113
    invoke-virtual/range {p14 .. p14}, Lu2/f;->c()F

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    cmpg-float v0, v12, v0

    .line 118
    .line 119
    if-gtz v0, :cond_9

    .line 120
    .line 121
    if-nez v2, :cond_9

    .line 122
    .line 123
    const/4 v0, 0x1

    .line 124
    iput-boolean v0, v1, Lu2/k;->l:Z

    .line 125
    .line 126
    if-ltz v5, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    const-string v2, "negative width"

    .line 130
    .line 131
    invoke-static {v2}, Lz2/a;->a(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    if-ltz v5, :cond_7

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_7
    const-string v2, "negative ellipsized width"

    .line 138
    .line 139
    invoke-static {v2}, Lz2/a;->a(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :goto_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 143
    .line 144
    if-lt v2, v14, :cond_8

    .line 145
    .line 146
    move v4, v5

    .line 147
    move-object v5, v6

    .line 148
    move-object v6, v9

    .line 149
    move v9, v4

    .line 150
    move-object v2, v3

    .line 151
    move-object/from16 v3, p3

    .line 152
    .line 153
    invoke-static/range {v2 .. v9}, Ld/o;->e(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    goto :goto_5

    .line 158
    :cond_8
    move v4, v5

    .line 159
    move-object v5, v6

    .line 160
    move-object v6, v9

    .line 161
    new-instance v2, Landroid/text/BoringLayout;

    .line 162
    .line 163
    const/high16 v7, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    move v12, v4

    .line 167
    move-object/from16 v3, p1

    .line 168
    .line 169
    move-object/from16 v11, p5

    .line 170
    .line 171
    move/from16 v10, p7

    .line 172
    .line 173
    move-object v9, v6

    .line 174
    move-object v6, v5

    .line 175
    move v5, v4

    .line 176
    move-object/from16 v4, p3

    .line 177
    .line 178
    invoke-direct/range {v2 .. v12}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)V

    .line 179
    .line 180
    .line 181
    move-object v3, v2

    .line 182
    :goto_5
    move/from16 v9, p8

    .line 183
    .line 184
    move-object v7, v13

    .line 185
    goto :goto_6

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    goto/16 :goto_19

    .line 188
    .line 189
    :cond_9
    move v4, v5

    .line 190
    move-object v5, v6

    .line 191
    const/4 v0, 0x1

    .line 192
    const/4 v2, 0x0

    .line 193
    iput-boolean v2, v1, Lu2/k;->l:Z

    .line 194
    .line 195
    sget-object v3, Lu2/g;->a:Lr5/p;

    .line 196
    .line 197
    move v6, v4

    .line 198
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    double-to-float v3, v7

    .line 207
    float-to-int v11, v3

    .line 208
    sget-object v3, Lu2/g;->a:Lr5/p;

    .line 209
    .line 210
    const/4 v7, 0x0

    .line 211
    new-instance v2, Lu2/h;

    .line 212
    .line 213
    move-object/from16 v10, p5

    .line 214
    .line 215
    move/from16 v9, p8

    .line 216
    .line 217
    move/from16 v14, p9

    .line 218
    .line 219
    move/from16 v15, p10

    .line 220
    .line 221
    move/from16 v16, p11

    .line 222
    .line 223
    move/from16 v17, p12

    .line 224
    .line 225
    move/from16 v12, p13

    .line 226
    .line 227
    move-object v0, v3

    .line 228
    move-object v8, v5

    .line 229
    move-object v7, v13

    .line 230
    move-object/from16 v3, p1

    .line 231
    .line 232
    move-object/from16 v5, p3

    .line 233
    .line 234
    move/from16 v13, p7

    .line 235
    .line 236
    invoke-direct/range {v2 .. v17}, Lu2/h;-><init>(Ljava/lang/CharSequence;ILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v2}, Lr5/p;->b(Lu2/h;)Landroid/text/StaticLayout;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    :goto_6
    iput-object v3, v1, Lu2/k;->f:Landroid/text/Layout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    .line 245
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Landroid/text/Layout;->getLineCount()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    iput v0, v1, Lu2/k;->g:I

    .line 257
    .line 258
    add-int/lit8 v2, v0, -0x1

    .line 259
    .line 260
    if-ge v0, v9, :cond_b

    .line 261
    .line 262
    :cond_a
    const/4 v14, 0x0

    .line 263
    goto :goto_7

    .line 264
    :cond_b
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-gtz v4, :cond_c

    .line 269
    .line 270
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineEnd(I)I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    if-eq v4, v5, :cond_a

    .line 279
    .line 280
    :cond_c
    const/4 v14, 0x1

    .line 281
    :goto_7
    iput-boolean v14, v1, Lu2/k;->d:Z

    .line 282
    .line 283
    sget-wide v4, Lu2/l;->b:J

    .line 284
    .line 285
    const/16 v6, 0x20

    .line 286
    .line 287
    const-wide v8, 0xffffffffL

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    if-nez p7, :cond_16

    .line 293
    .line 294
    iget-boolean v10, v1, Lu2/k;->l:Z

    .line 295
    .line 296
    if-eqz v10, :cond_e

    .line 297
    .line 298
    move-object v10, v3

    .line 299
    check-cast v10, Landroid/text/BoringLayout;

    .line 300
    .line 301
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 302
    .line 303
    const/16 v12, 0x21

    .line 304
    .line 305
    if-lt v11, v12, :cond_d

    .line 306
    .line 307
    invoke-static {v10}, Ld/o;->o(Landroid/text/BoringLayout;)Z

    .line 308
    .line 309
    .line 310
    move-result v15

    .line 311
    goto :goto_a

    .line 312
    :cond_d
    :goto_8
    const/4 v15, 0x0

    .line 313
    goto :goto_a

    .line 314
    :cond_e
    const/16 v12, 0x21

    .line 315
    .line 316
    sget-object v10, Lu2/g;->a:Lr5/p;

    .line 317
    .line 318
    move-object v10, v3

    .line 319
    check-cast v10, Landroid/text/StaticLayout;

    .line 320
    .line 321
    sget-object v11, Lu2/g;->a:Lr5/p;

    .line 322
    .line 323
    iget v11, v11, Lr5/p;->a:I

    .line 324
    .line 325
    packed-switch v11, :pswitch_data_0

    .line 326
    .line 327
    .line 328
    goto :goto_8

    .line 329
    :pswitch_0
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 330
    .line 331
    if-lt v11, v12, :cond_f

    .line 332
    .line 333
    invoke-static {v10}, Ld/o;->p(Landroid/text/StaticLayout;)Z

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    goto :goto_9

    .line 338
    :cond_f
    const/16 v10, 0x1c

    .line 339
    .line 340
    if-lt v11, v10, :cond_10

    .line 341
    .line 342
    const/4 v14, 0x1

    .line 343
    goto :goto_9

    .line 344
    :cond_10
    const/4 v14, 0x0

    .line 345
    :goto_9
    move v15, v14

    .line 346
    :goto_a
    if-eqz v15, :cond_11

    .line 347
    .line 348
    goto :goto_f

    .line 349
    :cond_11
    invoke-virtual {v3}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    const/4 v13, 0x0

    .line 358
    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineStart(I)I

    .line 359
    .line 360
    .line 361
    move-result v14

    .line 362
    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineEnd(I)I

    .line 363
    .line 364
    .line 365
    move-result v15

    .line 366
    invoke-static {v14, v15, v10, v11}, Ln7/b0;->k(IILandroid/text/TextPaint;Ljava/lang/CharSequence;)Landroid/graphics/Rect;

    .line 367
    .line 368
    .line 369
    move-result-object v14

    .line 370
    invoke-virtual {v3, v13}, Landroid/text/Layout;->getLineAscent(I)I

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    iget v13, v14, Landroid/graphics/Rect;->top:I

    .line 375
    .line 376
    if-ge v13, v15, :cond_12

    .line 377
    .line 378
    sub-int/2addr v15, v13

    .line 379
    :goto_b
    const/4 v13, 0x1

    .line 380
    goto :goto_c

    .line 381
    :cond_12
    invoke-virtual {v3}, Landroid/text/Layout;->getTopPadding()I

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    goto :goto_b

    .line 386
    :goto_c
    if-ne v0, v13, :cond_13

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_13
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineStart(I)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineEnd(I)I

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    invoke-static {v0, v13, v10, v11}, Ln7/b0;->k(IILandroid/text/TextPaint;Ljava/lang/CharSequence;)Landroid/graphics/Rect;

    .line 398
    .line 399
    .line 400
    move-result-object v14

    .line 401
    :goto_d
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineDescent(I)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    iget v10, v14, Landroid/graphics/Rect;->bottom:I

    .line 406
    .line 407
    if-le v10, v0, :cond_14

    .line 408
    .line 409
    sub-int/2addr v10, v0

    .line 410
    goto :goto_e

    .line 411
    :cond_14
    invoke-virtual {v3}, Landroid/text/Layout;->getBottomPadding()I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    :goto_e
    if-nez v15, :cond_15

    .line 416
    .line 417
    if-nez v10, :cond_15

    .line 418
    .line 419
    goto :goto_f

    .line 420
    :cond_15
    int-to-long v13, v15

    .line 421
    shl-long/2addr v13, v6

    .line 422
    int-to-long v10, v10

    .line 423
    and-long/2addr v10, v8

    .line 424
    or-long/2addr v10, v13

    .line 425
    goto :goto_10

    .line 426
    :cond_16
    const/16 v12, 0x21

    .line 427
    .line 428
    :goto_f
    move-wide v10, v4

    .line 429
    :goto_10
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    instance-of v0, v0, Landroid/text/Spanned;

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    if-nez v0, :cond_17

    .line 437
    .line 438
    goto :goto_11

    .line 439
    :cond_17
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-string v14, "null cannot be cast to non-null type android.text.Spanned"

    .line 444
    .line 445
    invoke-static {v0, v14}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    check-cast v0, Landroid/text/Spanned;

    .line 449
    .line 450
    const-class v15, Lw2/h;

    .line 451
    .line 452
    invoke-static {v0, v15}, Lnd/h;->o(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-nez v0, :cond_18

    .line 457
    .line 458
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-lez v0, :cond_18

    .line 467
    .line 468
    :goto_11
    move-object v0, v13

    .line 469
    goto :goto_12

    .line 470
    :cond_18
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {v0, v14}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    check-cast v0, Landroid/text/Spanned;

    .line 478
    .line 479
    invoke-virtual {v3}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    const/4 v14, 0x0

    .line 488
    invoke-interface {v0, v14, v3, v15}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    check-cast v0, [Lw2/h;

    .line 493
    .line 494
    :goto_12
    iput-object v0, v1, Lu2/k;->o:[Lw2/h;

    .line 495
    .line 496
    if-eqz v0, :cond_1d

    .line 497
    .line 498
    array-length v3, v0

    .line 499
    const/4 v4, 0x0

    .line 500
    const/4 v5, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    :goto_13
    if-ge v15, v3, :cond_1b

    .line 503
    .line 504
    aget-object v14, v0, v15

    .line 505
    .line 506
    const/16 p1, 0x20

    .line 507
    .line 508
    iget v6, v14, Lw2/h;->k:I

    .line 509
    .line 510
    if-gez v6, :cond_19

    .line 511
    .line 512
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    :cond_19
    iget v6, v14, Lw2/h;->l:I

    .line 521
    .line 522
    if-gez v6, :cond_1a

    .line 523
    .line 524
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    :cond_1a
    add-int/lit8 v15, v15, 0x1

    .line 533
    .line 534
    const/16 v6, 0x20

    .line 535
    .line 536
    goto :goto_13

    .line 537
    :cond_1b
    const/16 p1, 0x20

    .line 538
    .line 539
    if-nez v4, :cond_1c

    .line 540
    .line 541
    if-nez v5, :cond_1c

    .line 542
    .line 543
    sget-wide v3, Lu2/l;->b:J

    .line 544
    .line 545
    :goto_14
    move-wide v4, v3

    .line 546
    goto :goto_15

    .line 547
    :cond_1c
    int-to-long v3, v4

    .line 548
    shl-long v3, v3, p1

    .line 549
    .line 550
    int-to-long v5, v5

    .line 551
    and-long/2addr v5, v8

    .line 552
    or-long/2addr v3, v5

    .line 553
    goto :goto_14

    .line 554
    :cond_1d
    const/16 p1, 0x20

    .line 555
    .line 556
    :goto_15
    shr-long v14, v10, p1

    .line 557
    .line 558
    long-to-int v0, v14

    .line 559
    shr-long v14, v4, p1

    .line 560
    .line 561
    long-to-int v3, v14

    .line 562
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    iput v0, v1, Lu2/k;->h:I

    .line 567
    .line 568
    and-long/2addr v10, v8

    .line 569
    long-to-int v0, v10

    .line 570
    and-long/2addr v4, v8

    .line 571
    long-to-int v3, v4

    .line 572
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    iput v0, v1, Lu2/k;->i:I

    .line 577
    .line 578
    iget-object v9, v1, Lu2/k;->a:Landroid/text/TextPaint;

    .line 579
    .line 580
    iget-object v0, v1, Lu2/k;->o:[Lw2/h;

    .line 581
    .line 582
    iget v3, v1, Lu2/k;->g:I

    .line 583
    .line 584
    const/4 v4, 0x1

    .line 585
    sub-int/2addr v3, v4

    .line 586
    iget-object v4, v1, Lu2/k;->f:Landroid/text/Layout;

    .line 587
    .line 588
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineStart(I)I

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    invoke-virtual {v4, v3}, Landroid/text/Layout;->getLineEnd(I)I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-ne v5, v4, :cond_1e

    .line 597
    .line 598
    if-eqz v0, :cond_1e

    .line 599
    .line 600
    array-length v4, v0

    .line 601
    if-nez v4, :cond_1f

    .line 602
    .line 603
    :cond_1e
    const/4 v7, 0x0

    .line 604
    goto/16 :goto_17

    .line 605
    .line 606
    :cond_1f
    move-object v11, v7

    .line 607
    new-instance v7, Landroid/text/SpannableString;

    .line 608
    .line 609
    const-string v4, "\u200b"

    .line 610
    .line 611
    invoke-direct {v7, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 612
    .line 613
    .line 614
    invoke-static {v0}, Lvb/l;->u0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    check-cast v0, Lw2/h;

    .line 619
    .line 620
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    if-eqz v3, :cond_20

    .line 625
    .line 626
    iget-boolean v3, v0, Lw2/h;->d:Z

    .line 627
    .line 628
    if-eqz v3, :cond_20

    .line 629
    .line 630
    const/4 v15, 0x0

    .line 631
    goto :goto_16

    .line 632
    :cond_20
    iget-boolean v15, v0, Lw2/h;->d:Z

    .line 633
    .line 634
    :goto_16
    new-instance v3, Lw2/h;

    .line 635
    .line 636
    iget v5, v0, Lw2/h;->a:F

    .line 637
    .line 638
    iget-boolean v6, v0, Lw2/h;->d:Z

    .line 639
    .line 640
    iget v8, v0, Lw2/h;->e:F

    .line 641
    .line 642
    iget-boolean v0, v0, Lw2/h;->f:Z

    .line 643
    .line 644
    move/from16 p11, v0

    .line 645
    .line 646
    move-object/from16 p5, v3

    .line 647
    .line 648
    move/from16 p7, v4

    .line 649
    .line 650
    move/from16 p6, v5

    .line 651
    .line 652
    move/from16 p9, v6

    .line 653
    .line 654
    move/from16 p10, v8

    .line 655
    .line 656
    move/from16 p8, v15

    .line 657
    .line 658
    invoke-direct/range {p5 .. p11}, Lw2/h;-><init>(FIZZFZ)V

    .line 659
    .line 660
    .line 661
    move-object/from16 v0, p5

    .line 662
    .line 663
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    const/4 v13, 0x0

    .line 668
    invoke-virtual {v7, v0, v13, v3, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lu2/g;->a:Lr5/p;

    .line 672
    .line 673
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 674
    .line 675
    .line 676
    move-result v8

    .line 677
    iget-boolean v0, v1, Lu2/k;->c:Z

    .line 678
    .line 679
    sget-object v12, Lu2/d;->a:Landroid/text/Layout$Alignment;

    .line 680
    .line 681
    sget-object v3, Lu2/g;->a:Lr5/p;

    .line 682
    .line 683
    new-instance v6, Lu2/h;

    .line 684
    .line 685
    const v10, 0x7fffffff

    .line 686
    .line 687
    .line 688
    const v13, 0x7fffffff

    .line 689
    .line 690
    .line 691
    const/4 v14, 0x0

    .line 692
    const v15, 0x7fffffff

    .line 693
    .line 694
    .line 695
    const/16 v16, 0x0

    .line 696
    .line 697
    const/16 v18, 0x0

    .line 698
    .line 699
    const/16 v19, 0x0

    .line 700
    .line 701
    const/16 v20, 0x0

    .line 702
    .line 703
    const/16 v21, 0x0

    .line 704
    .line 705
    move/from16 v17, v0

    .line 706
    .line 707
    invoke-direct/range {v6 .. v21}, Lu2/h;-><init>(Ljava/lang/CharSequence;ILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3, v6}, Lr5/p;->b(Lu2/h;)Landroid/text/StaticLayout;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    new-instance v13, Landroid/graphics/Paint$FontMetricsInt;

    .line 715
    .line 716
    invoke-direct {v13}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    .line 717
    .line 718
    .line 719
    const/4 v7, 0x0

    .line 720
    invoke-virtual {v0, v7}, Landroid/text/Layout;->getLineAscent(I)I

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    iput v3, v13, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 725
    .line 726
    invoke-virtual {v0, v7}, Landroid/text/StaticLayout;->getLineDescent(I)I

    .line 727
    .line 728
    .line 729
    move-result v3

    .line 730
    iput v3, v13, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 731
    .line 732
    invoke-virtual {v0, v7}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    iput v3, v13, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 737
    .line 738
    invoke-virtual {v0, v7}, Landroid/text/Layout;->getLineBottom(I)I

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    iput v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 743
    .line 744
    :goto_17
    if-eqz v13, :cond_21

    .line 745
    .line 746
    iget v0, v13, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 747
    .line 748
    invoke-virtual {v1, v2}, Lu2/k;->e(I)F

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    invoke-virtual {v1, v2}, Lu2/k;->g(I)F

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    sub-float/2addr v3, v4

    .line 757
    float-to-int v3, v3

    .line 758
    sub-int v15, v0, v3

    .line 759
    .line 760
    goto :goto_18

    .line 761
    :cond_21
    const/4 v15, 0x0

    .line 762
    :goto_18
    iput v15, v1, Lu2/k;->n:I

    .line 763
    .line 764
    iput-object v13, v1, Lu2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 765
    .line 766
    iget-object v0, v1, Lu2/k;->f:Landroid/text/Layout;

    .line 767
    .line 768
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    invoke-static {v0, v2, v3}, Lvb/w;->k(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    .line 773
    .line 774
    .line 775
    move-result v0

    .line 776
    iput v0, v1, Lu2/k;->j:F

    .line 777
    .line 778
    iget-object v0, v1, Lu2/k;->f:Landroid/text/Layout;

    .line 779
    .line 780
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-static {v0, v2, v3}, Lvb/w;->l(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    iput v0, v1, Lu2/k;->k:F

    .line 789
    .line 790
    return-void

    .line 791
    :goto_19
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 792
    .line 793
    .line 794
    throw v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lu2/k;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lu2/k;->g:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    iget v1, p0, Lu2/k;->h:I

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    iget v1, p0, Lu2/k;->i:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    iget v1, p0, Lu2/k;->n:I

    .line 27
    .line 28
    add-int/2addr v0, v1

    .line 29
    return v0
.end method

.method public final b(I)F
    .locals 1

    .line 1
    iget v0, p0, Lu2/k;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lu2/k;->j:F

    .line 8
    .line 9
    iget v0, p0, Lu2/k;->k:F

    .line 10
    .line 11
    add-float/2addr p1, v0

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
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

.method public final c()Lch/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/k;->q:Lch/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lch/l;

    .line 6
    .line 7
    iget-object v1, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lch/l;-><init>(Landroid/text/Layout;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lu2/k;->q:Lch/l;

    .line 13
    .line 14
    :cond_0
    return-object v0
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
.end method

.method public final d(I)F
    .locals 2

    .line 1
    iget v0, p0, Lu2/k;->h:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, Lu2/k;->g:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lu2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lu2/k;->g(I)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    sub-float/2addr p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-float p1, p1

    .line 30
    :goto_0
    add-float/2addr v0, p1

    .line 31
    return v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final e(I)F
    .locals 3

    .line 1
    iget v0, p0, Lu2/k;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iget-object v2, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lu2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    iget v0, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 21
    .line 22
    int-to-float v0, v0

    .line 23
    add-float/2addr p1, v0

    .line 24
    return p1

    .line 25
    :cond_0
    iget v1, p0, Lu2/k;->h:I

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    add-float/2addr v1, v2

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    iget p1, p0, Lu2/k;->i:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    int-to-float p1, p1

    .line 43
    add-float/2addr v1, p1

    .line 44
    return v1
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
.end method

.method public final f(I)I
    .locals 3

    .line 1
    sget-object v0, Lu2/l;->a:Lu2/j;

    .line 2
    .line 3
    iget-object v0, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lu2/k;->b:Landroid/text/TextUtils$TruncateAt;

    .line 12
    .line 13
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final g(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p0, Lu2/k;->h:I

    .line 13
    .line 14
    :goto_0
    int-to-float p1, p1

    .line 15
    add-float/2addr v0, p1

    .line 16
    return v0
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

.method public final h(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu2/k;->c()Lch/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1, p1, p2}, Lch/l;->t(ZIZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lu2/k;->b(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-float/2addr p1, p2

    .line 21
    return p1
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
.end method

.method public final i(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lu2/k;->c()Lch/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1, p1, p2}, Lch/l;->t(ZIZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lu2/k;->b(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-float/2addr p1, p2

    .line 21
    return p1
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
.end method

.method public final j()Lce/g;
    .locals 4

    .line 1
    iget-object v0, p0, Lu2/k;->e:Lce/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lce/g;

    .line 7
    .line 8
    iget-object v1, p0, Lu2/k;->f:Landroid/text/Layout;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v3, p0, Lu2/k;->a:Landroid/text/TextPaint;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v0, v2, v1, v3}, Lce/g;-><init>(Ljava/lang/CharSequence;ILjava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lu2/k;->e:Lce/g;

    .line 32
    .line 33
    return-object v0
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
.end method
