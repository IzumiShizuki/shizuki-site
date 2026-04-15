.class public final Lj0/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lj0/b;

.field public final b:Lj0/l;

.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ly2/y;

.field public k:Lt2/i0;

.field public l:Ly2/r;

.field public m:Lp1/c;

.field public n:Lp1/c;

.field public final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public final p:[F

.field public final q:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lj0/b;Lj0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj0/n;->a:Lj0/b;

    .line 5
    .line 6
    iput-object p2, p0, Lj0/n;->b:Lj0/l;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lj0/n;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lj0/n;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 21
    .line 22
    invoke-static {}, Lq1/a0;->a()[F

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lj0/n;->p:[F

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lj0/n;->q:Landroid/graphics/Matrix;

    .line 34
    .line 35
    return-void
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


# virtual methods
.method public final a()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj0/n;->b:Lj0/l;

    .line 4
    .line 5
    invoke-virtual {v1}, Lj0/l;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v1, Lj0/l;->b:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_18

    .line 16
    .line 17
    iget-object v2, v0, Lj0/n;->j:Ly2/y;

    .line 18
    .line 19
    if-eqz v2, :cond_18

    .line 20
    .line 21
    iget-object v2, v0, Lj0/n;->l:Ly2/r;

    .line 22
    .line 23
    if-eqz v2, :cond_18

    .line 24
    .line 25
    iget-object v2, v0, Lj0/n;->k:Lt2/i0;

    .line 26
    .line 27
    if-eqz v2, :cond_18

    .line 28
    .line 29
    iget-object v2, v0, Lj0/n;->m:Lp1/c;

    .line 30
    .line 31
    if-eqz v2, :cond_18

    .line 32
    .line 33
    iget-object v2, v0, Lj0/n;->n:Lp1/c;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto/16 :goto_e

    .line 38
    .line 39
    :cond_0
    iget-object v2, v0, Lj0/n;->p:[F

    .line 40
    .line 41
    invoke-static {v2}, Lq1/a0;->d([F)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Lj0/n;->a:Lj0/b;

    .line 45
    .line 46
    iget-object v4, v4, Lj0/b;->i:Lj0/m;

    .line 47
    .line 48
    iget-object v4, v4, Lj0/m;->r:Lx0/e1;

    .line 49
    .line 50
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lg2/c0;

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-interface {v4}, Lg2/c0;->h()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v4, 0x0

    .line 66
    :goto_0
    if-nez v4, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-interface {v4, v2}, Lg2/c0;->j([F)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    iget-object v4, v0, Lj0/n;->n:Lp1/c;

    .line 73
    .line 74
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget v4, v4, Lp1/c;->a:F

    .line 78
    .line 79
    neg-float v4, v4

    .line 80
    iget-object v5, v0, Lj0/n;->n:Lp1/c;

    .line 81
    .line 82
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget v5, v5, Lp1/c;->b:F

    .line 86
    .line 87
    neg-float v5, v5

    .line 88
    invoke-static {v2, v4, v5}, Lq1/a0;->f([FFF)V

    .line 89
    .line 90
    .line 91
    iget-object v4, v0, Lj0/n;->q:Landroid/graphics/Matrix;

    .line 92
    .line 93
    invoke-static {v4, v2}, Lq1/h0;->u(Landroid/graphics/Matrix;[F)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, Lj0/n;->j:Ly2/y;

    .line 97
    .line 98
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-wide v5, v2, Ly2/y;->b:J

    .line 102
    .line 103
    iget-object v7, v0, Lj0/n;->l:Ly2/r;

    .line 104
    .line 105
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v8, v0, Lj0/n;->k:Lt2/i0;

    .line 109
    .line 110
    invoke-static {v8}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v9, v8, Lt2/i0;->b:Lt2/n;

    .line 114
    .line 115
    iget-object v10, v0, Lj0/n;->m:Lp1/c;

    .line 116
    .line 117
    invoke-static {v10}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget v11, v10, Lp1/c;->d:F

    .line 121
    .line 122
    iget v12, v10, Lp1/c;->b:F

    .line 123
    .line 124
    iget-object v13, v0, Lj0/n;->n:Lp1/c;

    .line 125
    .line 126
    invoke-static {v13}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-boolean v14, v0, Lj0/n;->f:Z

    .line 130
    .line 131
    iget-boolean v15, v0, Lj0/n;->g:Z

    .line 132
    .line 133
    move-object/from16 v16, v1

    .line 134
    .line 135
    iget-boolean v1, v0, Lj0/n;->h:Z

    .line 136
    .line 137
    move/from16 v17, v1

    .line 138
    .line 139
    iget-boolean v1, v0, Lj0/n;->i:Z

    .line 140
    .line 141
    move/from16 v25, v1

    .line 142
    .line 143
    iget-object v1, v0, Lj0/n;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v4}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 149
    .line 150
    .line 151
    iget-object v4, v2, Ly2/y;->c:Lt2/k0;

    .line 152
    .line 153
    move-wide/from16 v18, v5

    .line 154
    .line 155
    invoke-static/range {v18 .. v19}, Lt2/k0;->e(J)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-static/range {v18 .. v19}, Lt2/k0;->d(J)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-virtual {v1, v5, v6}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 164
    .line 165
    .line 166
    sget-object v6, Le3/j;->b:Le3/j;

    .line 167
    .line 168
    move-object/from16 v18, v1

    .line 169
    .line 170
    const/16 v26, 0x1

    .line 171
    .line 172
    if-eqz v14, :cond_b

    .line 173
    .line 174
    if-gez v5, :cond_4

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_4
    invoke-interface {v7, v5}, Ly2/r;->p(I)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-virtual {v8, v5}, Lt2/i0;->c(I)Lp1/c;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    iget v1, v14, Lp1/c;->a:F

    .line 186
    .line 187
    move/from16 v27, v11

    .line 188
    .line 189
    move/from16 v28, v12

    .line 190
    .line 191
    iget-wide v11, v8, Lt2/i0;->c:J

    .line 192
    .line 193
    const/16 v19, 0x20

    .line 194
    .line 195
    shr-long v11, v11, v19

    .line 196
    .line 197
    long-to-int v12, v11

    .line 198
    int-to-float v11, v12

    .line 199
    const/4 v12, 0x0

    .line 200
    invoke-static {v1, v12, v11}, Lnh/b;->j(FFF)F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    iget v11, v14, Lp1/c;->b:F

    .line 205
    .line 206
    invoke-static {v10, v1, v11}, La/a;->y(Lp1/c;FF)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    iget v12, v14, Lp1/c;->d:F

    .line 211
    .line 212
    invoke-static {v10, v1, v12}, La/a;->y(Lp1/c;FF)Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    invoke-virtual {v8, v5}, Lt2/i0;->a(I)Le3/j;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    if-ne v5, v6, :cond_5

    .line 221
    .line 222
    const/4 v5, 0x1

    .line 223
    goto :goto_2

    .line 224
    :cond_5
    const/4 v5, 0x0

    .line 225
    :goto_2
    if-nez v11, :cond_7

    .line 226
    .line 227
    if-eqz v12, :cond_6

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_6
    const/16 v19, 0x0

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_7
    :goto_3
    const/16 v19, 0x1

    .line 234
    .line 235
    :goto_4
    if-eqz v11, :cond_8

    .line 236
    .line 237
    if-nez v12, :cond_9

    .line 238
    .line 239
    :cond_8
    or-int/lit8 v19, v19, 0x2

    .line 240
    .line 241
    :cond_9
    if-eqz v5, :cond_a

    .line 242
    .line 243
    or-int/lit8 v19, v19, 0x4

    .line 244
    .line 245
    :cond_a
    move/from16 v23, v19

    .line 246
    .line 247
    iget v5, v14, Lp1/c;->b:F

    .line 248
    .line 249
    iget v11, v14, Lp1/c;->d:F

    .line 250
    .line 251
    move/from16 v22, v11

    .line 252
    .line 253
    move/from16 v19, v1

    .line 254
    .line 255
    move/from16 v20, v5

    .line 256
    .line 257
    move/from16 v21, v11

    .line 258
    .line 259
    invoke-virtual/range {v18 .. v23}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_b
    :goto_5
    move/from16 v27, v11

    .line 264
    .line 265
    move/from16 v28, v12

    .line 266
    .line 267
    :goto_6
    move-object/from16 v1, v18

    .line 268
    .line 269
    if-eqz v15, :cond_15

    .line 270
    .line 271
    const/4 v5, -0x1

    .line 272
    if-eqz v4, :cond_c

    .line 273
    .line 274
    iget-wide v11, v4, Lt2/k0;->a:J

    .line 275
    .line 276
    invoke-static {v11, v12}, Lt2/k0;->e(J)I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    goto :goto_7

    .line 281
    :cond_c
    const/4 v11, -0x1

    .line 282
    :goto_7
    if-eqz v4, :cond_d

    .line 283
    .line 284
    iget-wide v4, v4, Lt2/k0;->a:J

    .line 285
    .line 286
    invoke-static {v4, v5}, Lt2/k0;->d(J)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    :cond_d
    if-ltz v11, :cond_15

    .line 291
    .line 292
    if-ge v11, v5, :cond_15

    .line 293
    .line 294
    iget-object v2, v2, Ly2/y;->a:Lt2/g;

    .line 295
    .line 296
    iget-object v2, v2, Lt2/g;->b:Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {v2, v11, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {v1, v11, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 303
    .line 304
    .line 305
    invoke-interface {v7, v11}, Ly2/r;->p(I)I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-interface {v7, v5}, Ly2/r;->p(I)I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    sub-int v12, v4, v2

    .line 314
    .line 315
    mul-int/lit8 v12, v12, 0x4

    .line 316
    .line 317
    new-array v12, v12, [F

    .line 318
    .line 319
    invoke-static {v2, v4}, Lt2/c0;->b(II)J

    .line 320
    .line 321
    .line 322
    move-result-wide v14

    .line 323
    invoke-virtual {v9, v14, v15, v12}, Lt2/n;->a(J[F)V

    .line 324
    .line 325
    .line 326
    :goto_8
    if-ge v11, v5, :cond_15

    .line 327
    .line 328
    invoke-interface {v7, v11}, Ly2/r;->p(I)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    sub-int v14, v4, v2

    .line 333
    .line 334
    mul-int/lit8 v14, v14, 0x4

    .line 335
    .line 336
    aget v15, v12, v14

    .line 337
    .line 338
    add-int/lit8 v18, v14, 0x1

    .line 339
    .line 340
    move-object/from16 v19, v1

    .line 341
    .line 342
    aget v1, v12, v18

    .line 343
    .line 344
    add-int/lit8 v18, v14, 0x2

    .line 345
    .line 346
    move/from16 v29, v2

    .line 347
    .line 348
    aget v2, v12, v18

    .line 349
    .line 350
    add-int/lit8 v14, v14, 0x3

    .line 351
    .line 352
    aget v14, v12, v14

    .line 353
    .line 354
    move/from16 v30, v5

    .line 355
    .line 356
    iget v5, v10, Lp1/c;->a:F

    .line 357
    .line 358
    cmpg-float v5, v5, v2

    .line 359
    .line 360
    if-gez v5, :cond_e

    .line 361
    .line 362
    const/16 v18, 0x1

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_e
    const/16 v18, 0x0

    .line 366
    .line 367
    :goto_9
    iget v5, v10, Lp1/c;->c:F

    .line 368
    .line 369
    cmpg-float v5, v15, v5

    .line 370
    .line 371
    if-gez v5, :cond_f

    .line 372
    .line 373
    const/4 v5, 0x1

    .line 374
    goto :goto_a

    .line 375
    :cond_f
    const/4 v5, 0x0

    .line 376
    :goto_a
    and-int v5, v18, v5

    .line 377
    .line 378
    cmpg-float v18, v28, v14

    .line 379
    .line 380
    if-gez v18, :cond_10

    .line 381
    .line 382
    const/16 v18, 0x1

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_10
    const/16 v18, 0x0

    .line 386
    .line 387
    :goto_b
    and-int v5, v5, v18

    .line 388
    .line 389
    cmpg-float v18, v1, v27

    .line 390
    .line 391
    if-gez v18, :cond_11

    .line 392
    .line 393
    const/16 v18, 0x1

    .line 394
    .line 395
    goto :goto_c

    .line 396
    :cond_11
    const/16 v18, 0x0

    .line 397
    .line 398
    :goto_c
    and-int v5, v5, v18

    .line 399
    .line 400
    invoke-static {v10, v15, v1}, La/a;->y(Lp1/c;FF)Z

    .line 401
    .line 402
    .line 403
    move-result v18

    .line 404
    if-eqz v18, :cond_12

    .line 405
    .line 406
    invoke-static {v10, v2, v14}, La/a;->y(Lp1/c;FF)Z

    .line 407
    .line 408
    .line 409
    move-result v18

    .line 410
    if-nez v18, :cond_13

    .line 411
    .line 412
    :cond_12
    or-int/lit8 v5, v5, 0x2

    .line 413
    .line 414
    :cond_13
    invoke-virtual {v8, v4}, Lt2/i0;->a(I)Le3/j;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    if-ne v4, v6, :cond_14

    .line 419
    .line 420
    or-int/lit8 v5, v5, 0x4

    .line 421
    .line 422
    :cond_14
    move/from16 v21, v1

    .line 423
    .line 424
    move/from16 v22, v2

    .line 425
    .line 426
    move/from16 v24, v5

    .line 427
    .line 428
    move/from16 v23, v14

    .line 429
    .line 430
    move/from16 v20, v15

    .line 431
    .line 432
    move-object/from16 v18, v19

    .line 433
    .line 434
    move/from16 v19, v11

    .line 435
    .line 436
    invoke-virtual/range {v18 .. v24}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 437
    .line 438
    .line 439
    move-object/from16 v1, v18

    .line 440
    .line 441
    add-int/lit8 v11, v19, 0x1

    .line 442
    .line 443
    move/from16 v2, v29

    .line 444
    .line 445
    move/from16 v5, v30

    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 449
    .line 450
    const/16 v4, 0x21

    .line 451
    .line 452
    if-lt v2, v4, :cond_16

    .line 453
    .line 454
    if-eqz v17, :cond_16

    .line 455
    .line 456
    invoke-static {}, Ld/o;->h()Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-static {v13}, Lq1/h0;->A(Lp1/c;)Landroid/graphics/RectF;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-static {v4, v5}, Ld/o;->i(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    invoke-static {v13}, Lq1/h0;->A(Lp1/c;)Landroid/graphics/RectF;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    invoke-static {v4, v5}, Ld/o;->r(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    invoke-static {v4}, Ld/o;->j(Landroid/view/inputmethod/EditorBoundsInfo$Builder;)Landroid/view/inputmethod/EditorBoundsInfo;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    invoke-static {v1, v4}, Ld/o;->g(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroid/view/inputmethod/EditorBoundsInfo;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 481
    .line 482
    .line 483
    :cond_16
    const/16 v4, 0x22

    .line 484
    .line 485
    if-lt v2, v4, :cond_17

    .line 486
    .line 487
    if-eqz v25, :cond_17

    .line 488
    .line 489
    invoke-virtual {v10}, Lp1/c;->f()Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    if-nez v2, :cond_17

    .line 494
    .line 495
    move/from16 v2, v28

    .line 496
    .line 497
    invoke-virtual {v9, v2}, Lt2/n;->e(F)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    move/from16 v4, v27

    .line 502
    .line 503
    invoke-virtual {v9, v4}, Lt2/n;->e(F)I

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-gt v2, v4, :cond_17

    .line 508
    .line 509
    :goto_d
    invoke-virtual {v8, v2}, Lt2/i0;->e(I)F

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    invoke-virtual {v9, v2}, Lt2/n;->f(I)F

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    invoke-virtual {v8, v2}, Lt2/i0;->f(I)F

    .line 518
    .line 519
    .line 520
    move-result v7

    .line 521
    invoke-virtual {v9, v2}, Lt2/n;->b(I)F

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    invoke-static {v1, v5, v6, v7, v10}, Lj0/g;->q(Landroid/view/inputmethod/CursorAnchorInfo$Builder;FFFF)V

    .line 526
    .line 527
    .line 528
    if-eq v2, v4, :cond_17

    .line 529
    .line 530
    add-int/lit8 v2, v2, 0x1

    .line 531
    .line 532
    goto :goto_d

    .line 533
    :cond_17
    invoke-virtual {v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-virtual/range {v16 .. v16}, Lj0/l;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    .line 542
    .line 543
    .line 544
    const/4 v1, 0x0

    .line 545
    iput-boolean v1, v0, Lj0/n;->e:Z

    .line 546
    .line 547
    :cond_18
    :goto_e
    return-void
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
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
