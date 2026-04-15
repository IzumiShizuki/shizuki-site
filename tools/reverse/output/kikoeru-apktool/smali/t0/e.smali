.class public final Lt0/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lt0/e;->a:I

    .line 2
    .line 3
    iput-wide p1, p0, Lt0/e;->b:J

    .line 4
    .line 5
    iput-object p3, p0, Lt0/e;->c:Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt0/e;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ly/k1;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Lx0/o;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v4, "$this$TextButton"

    .line 25
    .line 26
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    and-int/lit8 v1, v3, 0x11

    .line 30
    .line 31
    const/16 v4, 0x10

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eq v1, v4, :cond_0

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
    and-int/2addr v3, v5

    .line 41
    invoke-virtual {v2, v3, v1}, Lx0/o;->N(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-wide v3, v0, Lt0/e;->b:J

    .line 48
    .line 49
    invoke-static {v3, v4}, Lna/w;->a(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v5, v0, Lt0/e;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lz9/r;

    .line 56
    .line 57
    invoke-virtual {v5}, Lz9/r;->x()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    cmp-long v5, v3, v7

    .line 62
    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    const v3, 0x761e1137

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lx0/o;->W(I)V

    .line 69
    .line 70
    .line 71
    sget-object v3, Lm0/c1;->a:Lx0/o2;

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Lm0/b1;

    .line 78
    .line 79
    invoke-virtual {v3}, Lm0/b1;->f()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    invoke-virtual {v2, v6}, Lx0/o;->p(Z)V

    .line 84
    .line 85
    .line 86
    :goto_1
    move-wide v4, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    const v3, 0x761e18fc

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lx0/o;->W(I)V

    .line 92
    .line 93
    .line 94
    sget-object v3, Lm0/c1;->a:Lx0/o2;

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lm0/b1;

    .line 101
    .line 102
    invoke-virtual {v3}, Lm0/b1;->c()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-virtual {v2, v6}, Lx0/o;->p(Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :goto_2
    const/16 v23, 0x0

    .line 111
    .line 112
    const v24, 0x1fffa

    .line 113
    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    const-wide/16 v6, 0x0

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const-wide/16 v10, 0x0

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v13, 0x0

    .line 124
    const-wide/16 v14, 0x0

    .line 125
    .line 126
    const/16 v16, 0x0

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/16 v22, 0x0

    .line 137
    .line 138
    move-object/from16 v21, v2

    .line 139
    .line 140
    move-object v2, v1

    .line 141
    invoke-static/range {v2 .. v24}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    move-object/from16 v21, v2

    .line 146
    .line 147
    invoke-virtual/range {v21 .. v21}, Lx0/o;->Q()V

    .line 148
    .line 149
    .line 150
    :goto_3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 151
    .line 152
    return-object v1

    .line 153
    :pswitch_0
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    move-object/from16 v6, p2

    .line 162
    .line 163
    check-cast v6, Lx0/o;

    .line 164
    .line 165
    move-object/from16 v2, p3

    .line 166
    .line 167
    check-cast v2, Ljava/lang/Number;

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    and-int/lit8 v3, v2, 0x6

    .line 174
    .line 175
    const/4 v4, 0x2

    .line 176
    if-nez v3, :cond_4

    .line 177
    .line 178
    invoke-virtual {v6, v1}, Lx0/o;->g(Z)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_3

    .line 183
    .line 184
    const/4 v3, 0x4

    .line 185
    goto :goto_4

    .line 186
    :cond_3
    const/4 v3, 0x2

    .line 187
    :goto_4
    or-int/2addr v2, v3

    .line 188
    :cond_4
    and-int/lit8 v3, v2, 0x13

    .line 189
    .line 190
    const/16 v5, 0x12

    .line 191
    .line 192
    const/4 v12, 0x1

    .line 193
    const/4 v13, 0x0

    .line 194
    if-eq v3, v5, :cond_5

    .line 195
    .line 196
    const/4 v3, 0x1

    .line 197
    goto :goto_5

    .line 198
    :cond_5
    const/4 v3, 0x0

    .line 199
    :goto_5
    and-int/2addr v2, v12

    .line 200
    invoke-virtual {v6, v2, v3}, Lx0/o;->N(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    sget-object v2, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 207
    .line 208
    sget-object v3, Lj1/c;->e:Lj1/h;

    .line 209
    .line 210
    iget-object v5, v0, Lt0/e;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v5, Lt0/j;

    .line 213
    .line 214
    invoke-static {v3, v13}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-static {v6}, Lx0/v;->q(Lx0/o;)I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    invoke-virtual {v6}, Lx0/o;->l()Lx0/j1;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-static {v2, v6}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    sget-object v9, Li2/k;->g0:Li2/j;

    .line 231
    .line 232
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    sget-object v9, Li2/j;->b:Li2/i;

    .line 236
    .line 237
    invoke-virtual {v6}, Lx0/o;->a0()V

    .line 238
    .line 239
    .line 240
    iget-boolean v10, v6, Lx0/o;->S:Z

    .line 241
    .line 242
    if-eqz v10, :cond_6

    .line 243
    .line 244
    invoke-virtual {v6, v9}, Lx0/o;->k(Lic/a;)V

    .line 245
    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_6
    invoke-virtual {v6}, Lx0/o;->k0()V

    .line 249
    .line 250
    .line 251
    :goto_6
    sget-object v9, Li2/j;->g:Li2/h;

    .line 252
    .line 253
    invoke-static {v9, v3, v6}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 254
    .line 255
    .line 256
    sget-object v3, Li2/j;->f:Li2/h;

    .line 257
    .line 258
    invoke-static {v3, v8, v6}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 259
    .line 260
    .line 261
    sget-object v3, Li2/j;->j:Li2/h;

    .line 262
    .line 263
    iget-boolean v8, v6, Lx0/o;->S:Z

    .line 264
    .line 265
    if-nez v8, :cond_7

    .line 266
    .line 267
    invoke-virtual {v6}, Lx0/o;->K()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-static {v8, v9}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    if-nez v8, :cond_8

    .line 280
    .line 281
    :cond_7
    invoke-static {v7, v6, v7, v3}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 282
    .line 283
    .line 284
    :cond_8
    sget-object v3, Li2/j;->d:Li2/h;

    .line 285
    .line 286
    invoke-static {v3, v2, v6}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 287
    .line 288
    .line 289
    sget v2, Lt0/f;->c:F

    .line 290
    .line 291
    move v3, v2

    .line 292
    move-object v2, v5

    .line 293
    sget v5, Lt0/f;->d:F

    .line 294
    .line 295
    add-float/2addr v3, v5

    .line 296
    int-to-float v4, v4

    .line 297
    mul-float v3, v3, v4

    .line 298
    .line 299
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 300
    .line 301
    iget-wide v7, v0, Lt0/e;->b:J

    .line 302
    .line 303
    if-eqz v1, :cond_9

    .line 304
    .line 305
    const v1, -0x723d2547

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v1}, Lx0/o;->W(I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/c;->j(Lj1/q;F)Lj1/q;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const/16 v10, 0x186

    .line 316
    .line 317
    const/16 v11, 0x18

    .line 318
    .line 319
    move-object v9, v6

    .line 320
    move-wide v3, v7

    .line 321
    const-wide/16 v6, 0x0

    .line 322
    .line 323
    const/4 v8, 0x0

    .line 324
    invoke-static/range {v2 .. v11}, Lm0/g5;->a(Lj1/q;JFJILx0/o;II)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v9, v13}, Lx0/o;->p(Z)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_9
    move-object v9, v6

    .line 332
    move-wide v5, v7

    .line 333
    const v1, -0x72395d9e

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v1}, Lx0/o;->W(I)V

    .line 337
    .line 338
    .line 339
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/c;->j(Lj1/q;F)Lj1/q;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    const/16 v7, 0x180

    .line 344
    .line 345
    move-wide v3, v5

    .line 346
    move-object v6, v9

    .line 347
    move-object v5, v1

    .line 348
    invoke-static/range {v2 .. v7}, Lt0/f;->a(Lt0/j;JLj1/q;Lx0/o;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v9, v13}, Lx0/o;->p(Z)V

    .line 352
    .line 353
    .line 354
    :goto_7
    invoke-virtual {v9, v12}, Lx0/o;->p(Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_a
    move-object v9, v6

    .line 359
    invoke-virtual {v9}, Lx0/o;->Q()V

    .line 360
    .line 361
    .line 362
    :goto_8
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 363
    .line 364
    return-object v1

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
