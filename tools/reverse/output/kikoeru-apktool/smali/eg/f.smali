.class public final Leg/f;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/p1;ZLw/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Leg/f;->b:I

    .line 1
    iput-object p1, p0, Leg/f;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Leg/f;->c:Z

    iput-object p3, p0, Leg/f;->e:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lic/n;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Leg/f;->b:I

    .line 2
    iput-boolean p3, p0, Leg/f;->c:Z

    iput-object p2, p0, Leg/f;->d:Ljava/lang/Object;

    check-cast p1, Lac/i;

    iput-object p1, p0, Leg/f;->e:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lw/k;Lv0/a0;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Leg/f;->b:I

    .line 3
    iput-object p1, p0, Leg/f;->d:Ljava/lang/Object;

    iput-object p2, p0, Leg/f;->e:Ljava/lang/Object;

    iput-boolean p3, p0, Leg/f;->c:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Leg/f;->b:I

    .line 2
    .line 3
    iget-boolean v1, p0, Leg/f;->c:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Leg/f;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Leg/f;->d:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lv0/l0;

    .line 14
    .line 15
    move-object/from16 v12, p2

    .line 16
    .line 17
    check-cast v12, Lx0/o;

    .line 18
    .line 19
    move-object/from16 p1, p3

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    and-int/lit8 p1, p1, 0x11

    .line 28
    .line 29
    const/16 v0, 0x10

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v12}, Lx0/o;->z()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v12}, Lx0/o;->Q()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    move-object v6, v4

    .line 45
    check-cast v6, Lw/k;

    .line 46
    .line 47
    move-object v8, v3

    .line 48
    check-cast v8, Lv0/a0;

    .line 49
    .line 50
    const-wide/16 v10, 0x0

    .line 51
    .line 52
    const/high16 v13, 0x30000

    .line 53
    .line 54
    sget-object v5, Lv0/e0;->a:Lv0/e0;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    iget-boolean v9, p0, Leg/f;->c:Z

    .line 58
    .line 59
    invoke-virtual/range {v5 .. v13}, Lv0/e0;->a(Lw/k;Lj1/q;Lv0/a0;ZJLx0/o;I)V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    check-cast p1, Lj1/q;

    .line 66
    .line 67
    move-object/from16 p1, p2

    .line 68
    .line 69
    check-cast p1, Lx0/o;

    .line 70
    .line 71
    move-object/from16 v0, p3

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    check-cast v4, Lh0/p1;

    .line 79
    .line 80
    iget-object v0, v4, Lh0/p1;->f:Lx0/e1;

    .line 81
    .line 82
    const v5, 0x3001dc2a

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v5}, Lx0/o;->W(I)V

    .line 86
    .line 87
    .line 88
    sget-object v5, Lj2/l1;->n:Lx0/o2;

    .line 89
    .line 90
    invoke-virtual {p1, v5}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object v6, Lf3/m;->b:Lf3/m;

    .line 95
    .line 96
    const/4 v7, 0x1

    .line 97
    if-ne v5, v6, :cond_2

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const/4 v5, 0x0

    .line 102
    :goto_2
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lu/e1;

    .line 107
    .line 108
    sget-object v8, Lu/e1;->a:Lu/e1;

    .line 109
    .line 110
    if-eq v6, v8, :cond_4

    .line 111
    .line 112
    if-nez v5, :cond_3

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    const/4 v5, 0x0

    .line 116
    goto :goto_4

    .line 117
    :cond_4
    :goto_3
    const/4 v5, 0x1

    .line 118
    :goto_4
    invoke-virtual {p1, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    sget-object v9, Lx0/k;->a:Lx0/r0;

    .line 127
    .line 128
    if-nez v6, :cond_5

    .line 129
    .line 130
    if-ne v8, v9, :cond_6

    .line 131
    .line 132
    :cond_5
    new-instance v8, La0/f0;

    .line 133
    .line 134
    const/16 v6, 0xd

    .line 135
    .line 136
    invoke-direct {v8, v6, v4}, La0/f0;-><init>(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v8}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    check-cast v8, Lic/k;

    .line 143
    .line 144
    invoke-static {v8, p1}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    if-ne v8, v9, :cond_7

    .line 153
    .line 154
    new-instance v8, Lcg/c;

    .line 155
    .line 156
    const/4 v10, 0x6

    .line 157
    invoke-direct {v8, v6, v10}, Lcg/c;-><init>(Lx0/w0;I)V

    .line 158
    .line 159
    .line 160
    new-instance v6, Lu/k;

    .line 161
    .line 162
    invoke-direct {v6, v8}, Lu/k;-><init>(Lic/k;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    move-object v8, v6

    .line 169
    :cond_7
    check-cast v8, Lu/v1;

    .line 170
    .line 171
    invoke-virtual {p1, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-virtual {p1, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    or-int/2addr v6, v10

    .line 180
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    if-nez v6, :cond_8

    .line 185
    .line 186
    if-ne v10, v9, :cond_9

    .line 187
    .line 188
    :cond_8
    new-instance v10, Lh0/n1;

    .line 189
    .line 190
    invoke-direct {v10, v8, v4}, Lh0/n1;-><init>(Lu/v1;Lh0/p1;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_9
    check-cast v10, Lh0/n1;

    .line 197
    .line 198
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Lu/e1;

    .line 203
    .line 204
    if-eqz v1, :cond_a

    .line 205
    .line 206
    iget-object v1, v4, Lh0/p1;->b:Lx0/a1;

    .line 207
    .line 208
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    const/4 v4, 0x0

    .line 213
    cmpg-float v1, v1, v4

    .line 214
    .line 215
    if-nez v1, :cond_b

    .line 216
    .line 217
    :cond_a
    const/4 v7, 0x0

    .line 218
    :cond_b
    check-cast v3, Lw/k;

    .line 219
    .line 220
    invoke-static {v10, v0, v7, v5, v3}, Landroidx/compose/foundation/gestures/a;->b(Lh0/n1;Lu/e1;ZZLw/k;)Lj1/q;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {p1, v2}, Lx0/o;->p(Z)V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_1
    check-cast p1, Lj1/q;

    .line 229
    .line 230
    move-object/from16 v0, p2

    .line 231
    .line 232
    check-cast v0, Lx0/o;

    .line 233
    .line 234
    move-object/from16 v5, p3

    .line 235
    .line 236
    check-cast v5, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    const-string v5, "$this$composed"

    .line 242
    .line 243
    invoke-static {p1, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const v5, 0x13fd1710

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v5}, Lx0/o;->X(I)V

    .line 250
    .line 251
    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    move-object v7, v4

    .line 255
    check-cast v7, Ljava/lang/String;

    .line 256
    .line 257
    check-cast v3, Lac/i;

    .line 258
    .line 259
    sget-object v1, Lc2/e0;->a:Lc2/l;

    .line 260
    .line 261
    new-instance v6, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 262
    .line 263
    new-instance v10, Lc2/d0;

    .line 264
    .line 265
    invoke-direct {v10, v3}, Lc2/d0;-><init>(Lic/n;)V

    .line 266
    .line 267
    .line 268
    const/4 v11, 0x6

    .line 269
    const/4 v8, 0x0

    .line 270
    const/4 v9, 0x0

    .line 271
    invoke-direct/range {v6 .. v11}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {p1, v6}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    :cond_c
    invoke-virtual {v0, v2}, Lx0/o;->p(Z)V

    .line 279
    .line 280
    .line 281
    return-object p1

    .line 282
    nop

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
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
