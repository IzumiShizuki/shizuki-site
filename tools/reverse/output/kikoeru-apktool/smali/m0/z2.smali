.class public final synthetic Lm0/z2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lm0/b3;ZLic/a;I)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    iput p4, p0, Lm0/z2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/z2;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lm0/z2;->b:Z

    iput-object p3, p0, Lm0/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lna/u;ZLka/g;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lm0/z2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/z2;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lm0/z2;->b:Z

    iput-object p3, p0, Lm0/z2;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm0/z2;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    iget-object v3, v0, Lm0/z2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-boolean v4, v0, Lm0/z2;->b:Z

    .line 10
    .line 11
    iget-object v5, v0, Lm0/z2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v5, Lna/u;

    .line 18
    .line 19
    check-cast v3, Lka/g;

    .line 20
    .line 21
    move-object/from16 v12, p1

    .line 22
    .line 23
    check-cast v12, Lx0/o;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/lit8 v7, v1, 0x3

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v9, 0x2

    .line 37
    if-eq v7, v9, :cond_0

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v7, 0x0

    .line 42
    :goto_0
    and-int/2addr v1, v6

    .line 43
    invoke-virtual {v12, v1, v7}, Lx0/o;->N(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_11

    .line 48
    .line 49
    sget-object v1, Lj1/n;->a:Lj1/n;

    .line 50
    .line 51
    const/high16 v7, 0x3f800000    # 1.0f

    .line 52
    .line 53
    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    int-to-float v11, v8

    .line 58
    const/16 v13, 0x14

    .line 59
    .line 60
    int-to-float v13, v13

    .line 61
    const/16 v14, 0xa

    .line 62
    .line 63
    int-to-float v14, v14

    .line 64
    invoke-static {v10, v11, v13, v11, v14}, Landroidx/compose/foundation/layout/a;->m(Lj1/q;FFFF)Lj1/q;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    sget-object v13, Ly/k;->c:Ly/o0;

    .line 69
    .line 70
    sget-object v15, Lj1/c;->m:Lj1/f;

    .line 71
    .line 72
    invoke-static {v13, v15, v12, v8}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    invoke-static {v12}, Lx0/v;->q(Lx0/o;)I

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    invoke-virtual {v12}, Lx0/o;->l()Lx0/j1;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v10, v12}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    sget-object v16, Li2/k;->g0:Li2/j;

    .line 89
    .line 90
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move/from16 v16, v11

    .line 94
    .line 95
    sget-object v11, Li2/j;->b:Li2/i;

    .line 96
    .line 97
    invoke-virtual {v12}, Lx0/o;->a0()V

    .line 98
    .line 99
    .line 100
    const/16 p2, 0x0

    .line 101
    .line 102
    iget-boolean v8, v12, Lx0/o;->S:Z

    .line 103
    .line 104
    if-eqz v8, :cond_1

    .line 105
    .line 106
    invoke-virtual {v12, v11}, Lx0/o;->k(Lic/a;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    invoke-virtual {v12}, Lx0/o;->k0()V

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object v8, Li2/j;->g:Li2/h;

    .line 114
    .line 115
    invoke-static {v8, v13, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 116
    .line 117
    .line 118
    sget-object v13, Li2/j;->f:Li2/h;

    .line 119
    .line 120
    invoke-static {v13, v7, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 121
    .line 122
    .line 123
    sget-object v7, Li2/j;->j:Li2/h;

    .line 124
    .line 125
    iget-boolean v9, v12, Lx0/o;->S:Z

    .line 126
    .line 127
    if-nez v9, :cond_2

    .line 128
    .line 129
    invoke-virtual {v12}, Lx0/o;->K()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-static {v9, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-nez v6, :cond_3

    .line 142
    .line 143
    :cond_2
    invoke-static {v15, v12, v15, v7}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    sget-object v6, Li2/j;->d:Li2/h;

    .line 147
    .line 148
    invoke-static {v6, v10, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Lx0/o;->K()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    sget-object v10, Lx0/k;->a:Lx0/r0;

    .line 156
    .line 157
    if-ne v9, v10, :cond_4

    .line 158
    .line 159
    iget-object v9, v5, Lna/u;->o:Ljava/util/List;

    .line 160
    .line 161
    invoke-static {v9}, Lvb/m;->Y(Ljava/util/List;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    check-cast v9, Lna/f;

    .line 166
    .line 167
    iget v9, v9, Lna/f;->h:I

    .line 168
    .line 169
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    invoke-virtual {v12, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_4
    check-cast v9, Ljava/lang/Number;

    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    const v15, 0x7f0c0013

    .line 183
    .line 184
    .line 185
    invoke-static {v15}, Lna/q;->g(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    iget-object v0, v5, Lna/u;->h:Ljava/lang/String;

    .line 190
    .line 191
    sget-object v18, Lna/w;->a:Lxf/r;

    .line 192
    .line 193
    if-gez v9, :cond_5

    .line 194
    .line 195
    move-object/from16 v30, v2

    .line 196
    .line 197
    const-string v2, "negative! "

    .line 198
    .line 199
    invoke-static {v9, v2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    goto/16 :goto_2

    .line 204
    .line 205
    :cond_5
    move-object/from16 v30, v2

    .line 206
    .line 207
    const/16 v2, 0x400

    .line 208
    .line 209
    if-ge v9, v2, :cond_6

    .line 210
    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v9, "B"

    .line 220
    .line 221
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    goto :goto_2

    .line 229
    :cond_6
    const/high16 v2, 0x100000

    .line 230
    .line 231
    if-ge v9, v2, :cond_7

    .line 232
    .line 233
    int-to-float v2, v9

    .line 234
    const/16 v9, 0x400

    .line 235
    .line 236
    int-to-float v9, v9

    .line 237
    div-float/2addr v2, v9

    .line 238
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    move-object/from16 v18, v2

    .line 243
    .line 244
    const/4 v9, 0x1

    .line 245
    new-array v2, v9, [Ljava/lang/Object;

    .line 246
    .line 247
    aput-object v18, v2, p2

    .line 248
    .line 249
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    const-string v9, "%.2fKB"

    .line 254
    .line 255
    invoke-static {v9, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    goto :goto_2

    .line 260
    :cond_7
    const/high16 v2, 0x40000000    # 2.0f

    .line 261
    .line 262
    if-ge v9, v2, :cond_8

    .line 263
    .line 264
    int-to-float v2, v9

    .line 265
    const/16 v9, 0x400

    .line 266
    .line 267
    int-to-float v9, v9

    .line 268
    div-float/2addr v2, v9

    .line 269
    div-float/2addr v2, v9

    .line 270
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    move-object/from16 v18, v2

    .line 275
    .line 276
    const/4 v9, 0x1

    .line 277
    new-array v2, v9, [Ljava/lang/Object;

    .line 278
    .line 279
    aput-object v18, v2, p2

    .line 280
    .line 281
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    const-string v9, "%.2fMB"

    .line 286
    .line 287
    invoke-static {v9, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    goto :goto_2

    .line 292
    :cond_8
    const/16 v2, 0x400

    .line 293
    .line 294
    int-to-float v9, v9

    .line 295
    int-to-float v2, v2

    .line 296
    div-float/2addr v9, v2

    .line 297
    div-float/2addr v9, v2

    .line 298
    div-float/2addr v9, v2

    .line 299
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    move-object/from16 v18, v2

    .line 304
    .line 305
    const/4 v9, 0x1

    .line 306
    new-array v2, v9, [Ljava/lang/Object;

    .line 307
    .line 308
    aput-object v18, v2, p2

    .line 309
    .line 310
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const-string v9, "%.2fGB"

    .line 315
    .line 316
    invoke-static {v9, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string v15, " "

    .line 329
    .line 330
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v0, "("

    .line 337
    .line 338
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const-string v0, ")"

    .line 345
    .line 346
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    sget-object v2, Lm0/e9;->b:Lx0/o2;

    .line 354
    .line 355
    invoke-virtual {v12, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    check-cast v9, Lm0/d9;

    .line 360
    .line 361
    iget-object v9, v9, Lm0/d9;->e:Lt2/l0;

    .line 362
    .line 363
    const/16 v15, 0x18

    .line 364
    .line 365
    int-to-float v15, v15

    .line 366
    move-object/from16 v18, v0

    .line 367
    .line 368
    const/4 v0, 0x0

    .line 369
    move-object/from16 v19, v7

    .line 370
    .line 371
    const/4 v7, 0x2

    .line 372
    invoke-static {v1, v15, v0, v7}, Landroidx/compose/foundation/layout/a;->l(Lj1/q;FFI)Lj1/q;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    const/16 v28, 0x0

    .line 377
    .line 378
    const v29, 0xfffc

    .line 379
    .line 380
    .line 381
    move-object/from16 v25, v9

    .line 382
    .line 383
    move-object v7, v10

    .line 384
    const-wide/16 v9, 0x0

    .line 385
    .line 386
    move-object/from16 v17, v11

    .line 387
    .line 388
    move-object/from16 v26, v12

    .line 389
    .line 390
    const-wide/16 v11, 0x0

    .line 391
    .line 392
    move-object/from16 v20, v13

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    move/from16 v21, v14

    .line 396
    .line 397
    const/4 v14, 0x0

    .line 398
    move/from16 v23, v15

    .line 399
    .line 400
    move/from16 v22, v16

    .line 401
    .line 402
    const-wide/16 v15, 0x0

    .line 403
    .line 404
    move-object/from16 v24, v17

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    move-object/from16 v27, v7

    .line 409
    .line 410
    move-object/from16 v7, v18

    .line 411
    .line 412
    const/16 v18, 0x0

    .line 413
    .line 414
    move-object/from16 v32, v19

    .line 415
    .line 416
    move-object/from16 v31, v20

    .line 417
    .line 418
    const-wide/16 v19, 0x0

    .line 419
    .line 420
    move/from16 v33, v21

    .line 421
    .line 422
    const/16 v21, 0x0

    .line 423
    .line 424
    move/from16 v34, v22

    .line 425
    .line 426
    const/16 v22, 0x0

    .line 427
    .line 428
    move/from16 v35, v23

    .line 429
    .line 430
    const/16 v23, 0x0

    .line 431
    .line 432
    move-object/from16 v36, v24

    .line 433
    .line 434
    const/16 v24, 0x0

    .line 435
    .line 436
    move-object/from16 v37, v27

    .line 437
    .line 438
    const/16 v27, 0x30

    .line 439
    .line 440
    move-object/from16 p1, v6

    .line 441
    .line 442
    move-object/from16 v38, v31

    .line 443
    .line 444
    move-object/from16 v39, v32

    .line 445
    .line 446
    move/from16 v6, v35

    .line 447
    .line 448
    move-object/from16 v40, v37

    .line 449
    .line 450
    move-object/from16 v32, v3

    .line 451
    .line 452
    move/from16 v31, v4

    .line 453
    .line 454
    move/from16 v4, v33

    .line 455
    .line 456
    const/high16 v3, 0x3f800000    # 1.0f

    .line 457
    .line 458
    move-object/from16 v33, v8

    .line 459
    .line 460
    move-object v8, v0

    .line 461
    move/from16 v0, v34

    .line 462
    .line 463
    invoke-static/range {v7 .. v29}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v12, v26

    .line 467
    .line 468
    iget-object v7, v5, Lna/u;->r:Ljava/lang/String;

    .line 469
    .line 470
    const/16 v8, 0x10

    .line 471
    .line 472
    int-to-float v8, v8

    .line 473
    invoke-static {v1, v6, v8, v6, v0}, Landroidx/compose/foundation/layout/a;->m(Lj1/q;FFFF)Lj1/q;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    invoke-virtual {v12, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    check-cast v2, Lm0/d9;

    .line 482
    .line 483
    iget-object v2, v2, Lm0/d9;->j:Lt2/l0;

    .line 484
    .line 485
    const-wide/16 v11, 0x0

    .line 486
    .line 487
    move-object/from16 v25, v2

    .line 488
    .line 489
    invoke-static/range {v7 .. v29}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 490
    .line 491
    .line 492
    move-object/from16 v12, v26

    .line 493
    .line 494
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    const/16 v2, 0xe

    .line 499
    .line 500
    int-to-float v2, v2

    .line 501
    invoke-static {v1, v2, v4, v2, v0}, Landroidx/compose/foundation/layout/a;->m(Lj1/q;FFFF)Lj1/q;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    sget-object v1, Ly/k;->b:Ly/o0;

    .line 506
    .line 507
    sget-object v2, Lj1/c;->j:Lj1/g;

    .line 508
    .line 509
    const/4 v3, 0x6

    .line 510
    invoke-static {v1, v2, v12, v3}, Ly/i1;->a(Ly/f;Lj1/g;Lx0/o;I)Ly/j1;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-static {v12}, Lx0/v;->q(Lx0/o;)I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    invoke-virtual {v12}, Lx0/o;->l()Lx0/j1;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-static {v0, v12}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v12}, Lx0/o;->a0()V

    .line 527
    .line 528
    .line 529
    iget-boolean v6, v12, Lx0/o;->S:Z

    .line 530
    .line 531
    if-eqz v6, :cond_9

    .line 532
    .line 533
    move-object/from16 v6, v36

    .line 534
    .line 535
    invoke-virtual {v12, v6}, Lx0/o;->k(Lic/a;)V

    .line 536
    .line 537
    .line 538
    :goto_3
    move-object/from16 v6, v33

    .line 539
    .line 540
    goto :goto_4

    .line 541
    :cond_9
    invoke-virtual {v12}, Lx0/o;->k0()V

    .line 542
    .line 543
    .line 544
    goto :goto_3

    .line 545
    :goto_4
    invoke-static {v6, v1, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 546
    .line 547
    .line 548
    move-object/from16 v1, v38

    .line 549
    .line 550
    invoke-static {v1, v4, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 551
    .line 552
    .line 553
    iget-boolean v1, v12, Lx0/o;->S:Z

    .line 554
    .line 555
    if-nez v1, :cond_a

    .line 556
    .line 557
    invoke-virtual {v12}, Lx0/o;->K()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-static {v1, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-nez v1, :cond_b

    .line 570
    .line 571
    :cond_a
    move-object/from16 v1, v39

    .line 572
    .line 573
    goto :goto_6

    .line 574
    :cond_b
    :goto_5
    move-object/from16 v1, p1

    .line 575
    .line 576
    goto :goto_7

    .line 577
    :goto_6
    invoke-static {v2, v12, v2, v1}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 578
    .line 579
    .line 580
    goto :goto_5

    .line 581
    :goto_7
    invoke-static {v1, v0, v12}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 582
    .line 583
    .line 584
    if-eqz v31, :cond_e

    .line 585
    .line 586
    const v0, 0x674ad018

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v0}, Lx0/o;->W(I)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v0, v32

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    invoke-virtual {v12}, Lx0/o;->K()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    if-nez v1, :cond_c

    .line 603
    .line 604
    move-object/from16 v1, v40

    .line 605
    .line 606
    if-ne v2, v1, :cond_d

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_c
    move-object/from16 v1, v40

    .line 610
    .line 611
    :goto_8
    new-instance v2, Lka/c;

    .line 612
    .line 613
    invoke-direct {v2, v0, v3}, Lka/c;-><init>(Lka/g;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_d
    move-object v7, v2

    .line 620
    check-cast v7, Lic/a;

    .line 621
    .line 622
    const/high16 v13, 0x30000000

    .line 623
    .line 624
    const/16 v14, 0x1fe

    .line 625
    .line 626
    const/4 v8, 0x0

    .line 627
    const/4 v9, 0x0

    .line 628
    const/4 v10, 0x0

    .line 629
    sget-object v11, Lna/c;->a:Lf1/f;

    .line 630
    .line 631
    invoke-static/range {v7 .. v14}, Landroid/support/v4/media/session/b;->o(Lic/a;Lj1/q;ZLm0/k1;Lic/o;Lx0/o;II)V

    .line 632
    .line 633
    .line 634
    const/4 v2, 0x0

    .line 635
    :goto_9
    invoke-virtual {v12, v2}, Lx0/o;->p(Z)V

    .line 636
    .line 637
    .line 638
    goto :goto_a

    .line 639
    :cond_e
    move-object/from16 v0, v32

    .line 640
    .line 641
    move-object/from16 v1, v40

    .line 642
    .line 643
    const/4 v2, 0x0

    .line 644
    const v3, 0x670ecff5

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v3}, Lx0/o;->W(I)V

    .line 648
    .line 649
    .line 650
    goto :goto_9

    .line 651
    :goto_a
    invoke-virtual {v12, v5}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    invoke-virtual {v12, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    or-int/2addr v2, v3

    .line 660
    invoke-virtual {v12}, Lx0/o;->K()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    if-nez v2, :cond_f

    .line 665
    .line 666
    if-ne v3, v1, :cond_10

    .line 667
    .line 668
    :cond_f
    new-instance v3, La9/d;

    .line 669
    .line 670
    const/16 v1, 0x16

    .line 671
    .line 672
    invoke-direct {v3, v1, v5, v0}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    :cond_10
    move-object v7, v3

    .line 679
    check-cast v7, Lic/a;

    .line 680
    .line 681
    const/high16 v13, 0x30000000

    .line 682
    .line 683
    const/16 v14, 0x1fe

    .line 684
    .line 685
    const/4 v8, 0x0

    .line 686
    const/4 v9, 0x0

    .line 687
    const/4 v10, 0x0

    .line 688
    sget-object v11, Lna/c;->b:Lf1/f;

    .line 689
    .line 690
    invoke-static/range {v7 .. v14}, Landroid/support/v4/media/session/b;->o(Lic/a;Lj1/q;ZLm0/k1;Lic/o;Lx0/o;II)V

    .line 691
    .line 692
    .line 693
    const/4 v9, 0x1

    .line 694
    invoke-virtual {v12, v9}, Lx0/o;->p(Z)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v9}, Lx0/o;->p(Z)V

    .line 698
    .line 699
    .line 700
    goto :goto_b

    .line 701
    :cond_11
    move-object/from16 v30, v2

    .line 702
    .line 703
    invoke-virtual {v12}, Lx0/o;->Q()V

    .line 704
    .line 705
    .line 706
    :goto_b
    return-object v30

    .line 707
    :pswitch_0
    move-object/from16 v30, v2

    .line 708
    .line 709
    move/from16 v31, v4

    .line 710
    .line 711
    const/4 v9, 0x1

    .line 712
    check-cast v5, Lm0/b3;

    .line 713
    .line 714
    check-cast v3, Lic/a;

    .line 715
    .line 716
    move-object/from16 v0, p1

    .line 717
    .line 718
    check-cast v0, Lx0/o;

    .line 719
    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Ljava/lang/Integer;

    .line 723
    .line 724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-static {v9}, Lx0/v;->D(I)I

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    move/from16 v2, v31

    .line 732
    .line 733
    invoke-virtual {v5, v2, v3, v0, v1}, Lm0/b3;->a(ZLic/a;Lx0/o;I)V

    .line 734
    .line 735
    .line 736
    return-object v30

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
