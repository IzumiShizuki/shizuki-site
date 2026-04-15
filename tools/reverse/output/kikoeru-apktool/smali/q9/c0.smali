.class public final synthetic Lq9/c0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq9/r0;

.field public final synthetic c:Lhf/y;


# direct methods
.method public synthetic constructor <init>(ILhf/y;Lq9/r0;)V
    .locals 0

    .line 1
    iput p1, p0, Lq9/c0;->a:I

    .line 2
    .line 3
    iput-object p3, p0, Lq9/c0;->b:Lq9/r0;

    .line 4
    .line 5
    iput-object p2, p0, Lq9/c0;->c:Lhf/y;

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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq9/c0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, La0/d;

    .line 11
    .line 12
    move-object/from16 v13, p2

    .line 13
    .line 14
    check-cast v13, Lx0/o;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-string v3, "$this$item"

    .line 25
    .line 26
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    and-int/lit8 v1, v2, 0x11

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eq v1, v3, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    :goto_0
    and-int/2addr v2, v5

    .line 41
    invoke-virtual {v13, v2, v1}, Lx0/o;->N(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    invoke-static {}, Ln7/b0;->m()Lw1/f;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const v1, 0x7f0c0152

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lna/q;->g(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v1, v0, Lq9/c0;->b:Lq9/r0;

    .line 59
    .line 60
    invoke-virtual {v1}, Lq9/r0;->w()Lbg/p;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v5, 0x0

    .line 68
    :goto_1
    invoke-virtual {v13, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iget-object v6, v0, Lq9/c0;->c:Lhf/y;

    .line 73
    .line 74
    invoke-virtual {v13, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    or-int/2addr v4, v7

    .line 79
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    if-nez v4, :cond_2

    .line 84
    .line 85
    sget-object v4, Lx0/k;->a:Lx0/r0;

    .line 86
    .line 87
    if-ne v7, v4, :cond_3

    .line 88
    .line 89
    :cond_2
    new-instance v7, Lq9/c;

    .line 90
    .line 91
    invoke-direct {v7, v1, v6}, Lq9/c;-><init>(Lq9/r0;Lhf/y;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v13, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    check-cast v7, Lic/a;

    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x7d4

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v14, 0x0

    .line 110
    invoke-static/range {v2 .. v16}, Lq9/a;->c(Lw1/f;Ljava/lang/String;Ljava/lang/String;ZILic/a;ZLic/a;ZLic/a;Lic/a;Lx0/o;III)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-virtual {v13}, Lx0/o;->Q()V

    .line 115
    .line 116
    .line 117
    :goto_2
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 118
    .line 119
    return-object v1

    .line 120
    :pswitch_0
    move-object/from16 v1, p1

    .line 121
    .line 122
    check-cast v1, Ly/w;

    .line 123
    .line 124
    move-object/from16 v11, p2

    .line 125
    .line 126
    check-cast v11, Lx0/o;

    .line 127
    .line 128
    move-object/from16 v2, p3

    .line 129
    .line 130
    check-cast v2, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    const-string v3, "$this$RTLModalDrawer"

    .line 137
    .line 138
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    and-int/lit8 v1, v2, 0x11

    .line 142
    .line 143
    const/16 v3, 0x10

    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x1

    .line 147
    if-eq v1, v3, :cond_5

    .line 148
    .line 149
    const/4 v1, 0x1

    .line 150
    goto :goto_3

    .line 151
    :cond_5
    const/4 v1, 0x0

    .line 152
    :goto_3
    and-int/2addr v2, v15

    .line 153
    invoke-virtual {v11, v2, v1}, Lx0/o;->N(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_d

    .line 158
    .line 159
    sget-object v1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 160
    .line 161
    sget-object v2, Ly/k;->c:Ly/o0;

    .line 162
    .line 163
    sget-object v3, Lj1/c;->m:Lj1/f;

    .line 164
    .line 165
    invoke-static {v2, v3, v11, v14}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-static {v11}, Lx0/v;->q(Lx0/o;)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v11}, Lx0/o;->l()Lx0/j1;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-static {v1, v11}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    sget-object v5, Li2/j;->b:Li2/i;

    .line 187
    .line 188
    invoke-virtual {v11}, Lx0/o;->a0()V

    .line 189
    .line 190
    .line 191
    iget-boolean v6, v11, Lx0/o;->S:Z

    .line 192
    .line 193
    if-eqz v6, :cond_6

    .line 194
    .line 195
    invoke-virtual {v11, v5}, Lx0/o;->k(Lic/a;)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-virtual {v11}, Lx0/o;->k0()V

    .line 200
    .line 201
    .line 202
    :goto_4
    sget-object v5, Li2/j;->g:Li2/h;

    .line 203
    .line 204
    invoke-static {v5, v2, v11}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 205
    .line 206
    .line 207
    sget-object v2, Li2/j;->f:Li2/h;

    .line 208
    .line 209
    invoke-static {v2, v4, v11}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 210
    .line 211
    .line 212
    sget-object v2, Li2/j;->j:Li2/h;

    .line 213
    .line 214
    iget-boolean v4, v11, Lx0/o;->S:Z

    .line 215
    .line 216
    if-nez v4, :cond_7

    .line 217
    .line 218
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-nez v4, :cond_8

    .line 231
    .line 232
    :cond_7
    invoke-static {v3, v11, v3, v2}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    sget-object v2, Li2/j;->d:Li2/h;

    .line 236
    .line 237
    invoke-static {v2, v1, v11}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v14, v11}, Lka/b;->h(ILx0/o;)V

    .line 241
    .line 242
    .line 243
    sget-object v2, Lq9/a;->v:Lf1/f;

    .line 244
    .line 245
    new-instance v1, Lba/l;

    .line 246
    .line 247
    const/16 v3, 0xa

    .line 248
    .line 249
    iget-object v4, v0, Lq9/c0;->b:Lq9/r0;

    .line 250
    .line 251
    invoke-direct {v1, v3, v4}, Lba/l;-><init>(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const v3, -0x22a037fa

    .line 255
    .line 256
    .line 257
    invoke-static {v3, v1, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    const/16 v12, 0xc06

    .line 262
    .line 263
    const/16 v13, 0x76

    .line 264
    .line 265
    const/4 v3, 0x0

    .line 266
    move-object v1, v4

    .line 267
    const/4 v4, 0x0

    .line 268
    const-wide/16 v6, 0x0

    .line 269
    .line 270
    const-wide/16 v8, 0x0

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    invoke-static/range {v2 .. v13}, Lm0/i0;->c(Lf1/f;Lj1/q;Lic/n;Lf1/f;JJFLx0/o;II)V

    .line 274
    .line 275
    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-static {v1, v2, v11, v14}, Lq9/a;->d(Lq9/r0;Lj1/q;Lx0/o;I)V

    .line 278
    .line 279
    .line 280
    iget-object v3, v1, Lq9/r0;->d:Lx0/e1;

    .line 281
    .line 282
    iget-object v4, v0, Lq9/c0;->c:Lhf/y;

    .line 283
    .line 284
    invoke-virtual {v11, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    invoke-virtual {v11, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    or-int/2addr v5, v6

    .line 293
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    sget-object v7, Lx0/k;->a:Lx0/r0;

    .line 298
    .line 299
    if-nez v5, :cond_9

    .line 300
    .line 301
    if-ne v6, v7, :cond_a

    .line 302
    .line 303
    :cond_9
    new-instance v6, Lq9/x;

    .line 304
    .line 305
    const/4 v5, 0x1

    .line 306
    invoke-direct {v6, v5, v4, v1}, Lq9/x;-><init>(ILhf/y;Lq9/r0;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_a
    check-cast v6, Lic/k;

    .line 313
    .line 314
    invoke-static {v3, v6, v11, v14}, Lq9/w;->e(Lx0/w0;Lic/k;Lx0/o;I)V

    .line 315
    .line 316
    .line 317
    iget-object v3, v1, Lq9/r0;->e:Lx0/e1;

    .line 318
    .line 319
    invoke-virtual {v11, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    invoke-virtual {v11, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    or-int/2addr v5, v6

    .line 328
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    if-nez v5, :cond_b

    .line 333
    .line 334
    if-ne v6, v7, :cond_c

    .line 335
    .line 336
    :cond_b
    new-instance v6, Lq9/x;

    .line 337
    .line 338
    const/4 v5, 0x2

    .line 339
    invoke-direct {v6, v5, v4, v1}, Lq9/x;-><init>(ILhf/y;Lq9/r0;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v11, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_c
    check-cast v6, Lic/k;

    .line 346
    .line 347
    invoke-static {v3, v2, v6, v11, v14}, Lq9/w;->a(Lx0/w0;Ljava/lang/String;Lic/k;Lx0/o;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v11, v15}, Lx0/o;->p(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_d
    invoke-virtual {v11}, Lx0/o;->Q()V

    .line 355
    .line 356
    .line 357
    :goto_5
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 358
    .line 359
    return-object v1

    .line 360
    nop

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
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
.end method
