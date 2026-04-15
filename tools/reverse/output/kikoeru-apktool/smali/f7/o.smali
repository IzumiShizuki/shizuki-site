.class public final Lf7/o;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc2/x;Lh0/c1;Lyb/c;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf7/o;->e:I

    .line 1
    iput-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    iput-object p2, p0, Lf7/o;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lhf/y;Le7/a0;Lx0/w0;Lyb/c;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lf7/o;->e:I

    .line 2
    iput-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    iput-object p2, p0, Lf7/o;->h:Ljava/lang/Object;

    iput-object p3, p0, Lf7/o;->f:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V
    .locals 0

    .line 3
    iput p5, p0, Lf7/o;->e:I

    iput-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    iput-object p2, p0, Lf7/o;->g:Ljava/lang/Object;

    iput-object p3, p0, Lf7/o;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lx0/w0;Lx0/w0;Lyb/c;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lf7/o;->e:I

    .line 4
    iput-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    iput-object p2, p0, Lf7/o;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 10

    .line 1
    iget v0, p0, Lf7/o;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lf7/o;

    .line 7
    .line 8
    iget-object v0, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lhf/y;

    .line 11
    .line 12
    iget-object v1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Le7/a0;

    .line 15
    .line 16
    iget-object v2, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lx0/w0;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1, v2, p2}, Lf7/o;-><init>(Lhf/y;Le7/a0;Lx0/w0;Lyb/c;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    new-instance v3, Lf7/o;

    .line 25
    .line 26
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p1

    .line 29
    check-cast v4, Lx0/w0;

    .line 30
    .line 31
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v5, p1

    .line 34
    check-cast v5, Lo1/r;

    .line 35
    .line 36
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v6, p1

    .line 39
    check-cast v6, Lj2/u2;

    .line 40
    .line 41
    const/16 v8, 0xa

    .line 42
    .line 43
    move-object v7, p2

    .line 44
    invoke-direct/range {v3 .. v8}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :pswitch_1
    move-object v8, p2

    .line 49
    new-instance p2, Lf7/o;

    .line 50
    .line 51
    iget-object v0, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lx0/w0;

    .line 54
    .line 55
    iget-object v1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lx0/w0;

    .line 58
    .line 59
    invoke-direct {p2, v0, v1, v8}, Lf7/o;-><init>(Lx0/w0;Lx0/w0;Lyb/c;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p2, Lf7/o;->g:Ljava/lang/Object;

    .line 63
    .line 64
    return-object p2

    .line 65
    :pswitch_2
    move-object v8, p2

    .line 66
    new-instance v4, Lf7/o;

    .line 67
    .line 68
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v5, p1

    .line 71
    check-cast v5, Ljava/util/List;

    .line 72
    .line 73
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v6, p1

    .line 76
    check-cast v6, Lbg/z;

    .line 77
    .line 78
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v7, p1

    .line 81
    check-cast v7, Ljava/lang/String;

    .line 82
    .line 83
    const/16 v9, 0x8

    .line 84
    .line 85
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_3
    move-object v8, p2

    .line 90
    new-instance v4, Lf7/o;

    .line 91
    .line 92
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, p1

    .line 95
    check-cast v5, Ljava/util/List;

    .line 96
    .line 97
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v6, p1

    .line 100
    check-cast v6, Lbg/z;

    .line 101
    .line 102
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v7, p1

    .line 105
    check-cast v7, Ljava/util/ArrayList;

    .line 106
    .line 107
    const/4 v9, 0x7

    .line 108
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 109
    .line 110
    .line 111
    return-object v4

    .line 112
    :pswitch_4
    move-object v8, p2

    .line 113
    new-instance v4, Lf7/o;

    .line 114
    .line 115
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v5, p1

    .line 118
    check-cast v5, Ljava/util/List;

    .line 119
    .line 120
    iget-object v6, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 121
    .line 122
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v7, p1

    .line 125
    check-cast v7, Lj9/f;

    .line 126
    .line 127
    const/4 v9, 0x6

    .line 128
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 129
    .line 130
    .line 131
    return-object v4

    .line 132
    :pswitch_5
    move-object v8, p2

    .line 133
    new-instance v4, Lf7/o;

    .line 134
    .line 135
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v5, p1

    .line 138
    check-cast v5, Lia/b;

    .line 139
    .line 140
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v6, p1

    .line 143
    check-cast v6, Landroid/content/Context;

    .line 144
    .line 145
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v7, p1

    .line 148
    check-cast v7, Ljava/lang/String;

    .line 149
    .line 150
    const/4 v9, 0x5

    .line 151
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 152
    .line 153
    .line 154
    return-object v4

    .line 155
    :pswitch_6
    move-object v8, p2

    .line 156
    new-instance p2, Lf7/o;

    .line 157
    .line 158
    iget-object v0, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lc2/x;

    .line 161
    .line 162
    iget-object v1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Lh0/c1;

    .line 165
    .line 166
    invoke-direct {p2, v0, v1, v8}, Lf7/o;-><init>(Lc2/x;Lh0/c1;Lyb/c;)V

    .line 167
    .line 168
    .line 169
    iput-object p1, p2, Lf7/o;->f:Ljava/lang/Object;

    .line 170
    .line 171
    return-object p2

    .line 172
    :pswitch_7
    move-object v8, p2

    .line 173
    new-instance v4, Lf7/o;

    .line 174
    .line 175
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v5, p1

    .line 178
    check-cast v5, Ljava/lang/String;

    .line 179
    .line 180
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v6, p1

    .line 183
    check-cast v6, Ljava/lang/String;

    .line 184
    .line 185
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v7, p1

    .line 188
    check-cast v7, Ljava/lang/String;

    .line 189
    .line 190
    const/4 v9, 0x3

    .line 191
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 192
    .line 193
    .line 194
    return-object v4

    .line 195
    :pswitch_8
    move-object v8, p2

    .line 196
    new-instance v4, Lf7/o;

    .line 197
    .line 198
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 199
    .line 200
    move-object v5, p1

    .line 201
    check-cast v5, Lc9/d;

    .line 202
    .line 203
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 204
    .line 205
    move-object v6, p1

    .line 206
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 207
    .line 208
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v7, p1

    .line 211
    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 212
    .line 213
    const/4 v9, 0x2

    .line 214
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 215
    .line 216
    .line 217
    return-object v4

    .line 218
    :pswitch_9
    move-object v8, p2

    .line 219
    new-instance v4, Lf7/o;

    .line 220
    .line 221
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 222
    .line 223
    move-object v5, p1

    .line 224
    check-cast v5, Lc9/c;

    .line 225
    .line 226
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 227
    .line 228
    move-object v6, p1

    .line 229
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 230
    .line 231
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 232
    .line 233
    move-object v7, p1

    .line 234
    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 235
    .line 236
    const/4 v9, 0x1

    .line 237
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 238
    .line 239
    .line 240
    return-object v4

    .line 241
    :pswitch_a
    move-object v8, p2

    .line 242
    new-instance v4, Lf7/o;

    .line 243
    .line 244
    iget-object p1, p0, Lf7/o;->f:Ljava/lang/Object;

    .line 245
    .line 246
    move-object v5, p1

    .line 247
    check-cast v5, Lx0/w0;

    .line 248
    .line 249
    iget-object p1, p0, Lf7/o;->g:Ljava/lang/Object;

    .line 250
    .line 251
    move-object v6, p1

    .line 252
    check-cast v6, Lf7/q;

    .line 253
    .line 254
    iget-object p1, p0, Lf7/o;->h:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v7, p1

    .line 257
    check-cast v7, Lh1/s;

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    invoke-direct/range {v4 .. v9}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 261
    .line 262
    .line 263
    return-object v4

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
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
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf7/o;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lhf/y;

    .line 7
    .line 8
    check-cast p2, Lyb/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lf7/o;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    check-cast p1, Lhf/y;

    .line 23
    .line 24
    check-cast p2, Lyb/c;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lf7/o;

    .line 31
    .line 32
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :pswitch_1
    check-cast p1, Lbg/a2;

    .line 39
    .line 40
    check-cast p2, Lyb/c;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lf7/o;

    .line 47
    .line 48
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_2
    check-cast p1, Lhf/y;

    .line 56
    .line 57
    check-cast p2, Lyb/c;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lf7/o;

    .line 64
    .line 65
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-object p2

    .line 71
    :pswitch_3
    check-cast p1, Lhf/y;

    .line 72
    .line 73
    check-cast p2, Lyb/c;

    .line 74
    .line 75
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lf7/o;

    .line 80
    .line 81
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :pswitch_4
    check-cast p1, Lhf/y;

    .line 88
    .line 89
    check-cast p2, Lyb/c;

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lf7/o;

    .line 96
    .line 97
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-object p2

    .line 103
    :pswitch_5
    check-cast p1, Lhf/y;

    .line 104
    .line 105
    check-cast p2, Lyb/c;

    .line 106
    .line 107
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lf7/o;

    .line 112
    .line 113
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return-object p2

    .line 119
    :pswitch_6
    check-cast p1, Lhf/y;

    .line 120
    .line 121
    check-cast p2, Lyb/c;

    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lf7/o;

    .line 128
    .line 129
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :pswitch_7
    check-cast p1, Lhf/y;

    .line 137
    .line 138
    check-cast p2, Lyb/c;

    .line 139
    .line 140
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Lf7/o;

    .line 145
    .line 146
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    return-object p2

    .line 152
    :pswitch_8
    check-cast p1, Lhf/y;

    .line 153
    .line 154
    check-cast p2, Lyb/c;

    .line 155
    .line 156
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, Lf7/o;

    .line 161
    .line 162
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    return-object p2

    .line 168
    :pswitch_9
    check-cast p1, Lhf/y;

    .line 169
    .line 170
    check-cast p2, Lyb/c;

    .line 171
    .line 172
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Lf7/o;

    .line 177
    .line 178
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    return-object p2

    .line 184
    :pswitch_a
    check-cast p1, Lhf/y;

    .line 185
    .line 186
    check-cast p2, Lyb/c;

    .line 187
    .line 188
    invoke-virtual {p0, p1, p2}, Lf7/o;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lf7/o;

    .line 193
    .line 194
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Lf7/o;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-object p2

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lf7/o;->e:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lub/a0;->a:Lub/a0;

    .line 9
    .line 10
    iget-object v6, v1, Lf7/o;->h:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "token"

    .line 25
    .line 26
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Lag/z;->a:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "/api/works?order=betterRandom"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, La0/c;->D(Ljava/lang/String;)Lch/l;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "Bearer "

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v3, "authorization"

    .line 48
    .line 49
    invoke-virtual {v2, v3, v0}, Lch/l;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lug/g;->n:Lug/g;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Lch/l;->p(Lug/g;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lb7/b1;

    .line 58
    .line 59
    invoke-direct {v0, v2}, Lb7/b1;-><init>(Lch/l;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    sget-object v2, Lag/z;->b:Lug/x;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lug/x;->a(Lb7/b1;)Lzg/n;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lzg/n;->f()Lug/d0;

    .line 69
    .line 70
    .line 71
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :try_start_1
    iget-object v0, v2, Lug/d0;->g:Lug/f0;

    .line 73
    .line 74
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lug/f0;->n()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget v3, v2, Lug/d0;->d:I

    .line 82
    .line 83
    const/16 v7, 0xc8

    .line 84
    .line 85
    if-ne v3, v7, :cond_0

    .line 86
    .line 87
    sget-object v3, Lag/z;->c:Lxf/r;

    .line 88
    .line 89
    iget-object v7, v3, Lxf/c;->b:Ld0/y;

    .line 90
    .line 91
    const-class v8, Lbg/d2;

    .line 92
    .line 93
    invoke-static {v8}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-static {v7, v8}, Ln7/e;->A(Ld0/y;Lpc/v;)Lsf/a;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Lsf/a;

    .line 102
    .line 103
    invoke-virtual {v3, v0, v7}, Lxf/c;->a(Ljava/lang/String;Lsf/a;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    invoke-virtual {v2}, Lug/d0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    move-object v3, v0

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    :try_start_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 126
    :goto_0
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 127
    :catchall_2
    move-exception v0

    .line 128
    :try_start_5
    invoke-static {v2, v3}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 132
    :goto_1
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_2
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lhf/y;

    .line 139
    .line 140
    move-object v8, v6

    .line 141
    check-cast v8, Le7/a0;

    .line 142
    .line 143
    instance-of v3, v0, Lub/m;

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    if-nez v3, :cond_1

    .line 147
    .line 148
    check-cast v0, Lbg/d2;

    .line 149
    .line 150
    iget-object v0, v0, Lbg/d2;->b:Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v4, v0}, Lvb/m;->b0(ILjava/util/List;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lbg/a2;

    .line 157
    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    iget-wide v9, v0, Lbg/a2;->f:J

    .line 161
    .line 162
    new-instance v7, Lb9/b;

    .line 163
    .line 164
    const/4 v12, 0x3

    .line 165
    invoke-direct/range {v7 .. v12}, Lb9/b;-><init>(Ljava/lang/Object;JLyb/c;I)V

    .line 166
    .line 167
    .line 168
    const/4 v0, 0x3

    .line 169
    invoke-static {v2, v11, v11, v7, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 170
    .line 171
    .line 172
    :cond_1
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lx0/w0;

    .line 175
    .line 176
    sget-object v2, Lr9/f;->a:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v0, v11}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-object v5

    .line 182
    :pswitch_0
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lx0/w0;

    .line 188
    .line 189
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_2

    .line 200
    .line 201
    iget-object v0, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Lo1/r;

    .line 204
    .line 205
    invoke-static {v0}, Lo1/r;->b(Lo1/r;)V

    .line 206
    .line 207
    .line 208
    check-cast v6, Lj2/u2;

    .line 209
    .line 210
    if-eqz v6, :cond_2

    .line 211
    .line 212
    check-cast v6, Lj2/n1;

    .line 213
    .line 214
    invoke-virtual {v6}, Lj2/n1;->b()V

    .line 215
    .line 216
    .line 217
    :cond_2
    return-object v5

    .line 218
    :pswitch_1
    iget-object v0, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lbg/a2;

    .line 221
    .line 222
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v2, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v2, Lx0/w0;

    .line 228
    .line 229
    invoke-interface {v2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    check-cast v2, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_a

    .line 240
    .line 241
    invoke-static {}, Lud/b;->l()Lwb/b;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    iget-object v5, v0, Lbg/a2;->v:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v2, v5}, Lwb/b;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    iget-object v5, v0, Lbg/a2;->j:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v2, v5}, Lwb/b;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    iget-object v5, v0, Lbg/a2;->x:Ljava/util/List;

    .line 256
    .line 257
    check-cast v5, Ljava/lang/Iterable;

    .line 258
    .line 259
    new-instance v7, Ljava/util/ArrayList;

    .line 260
    .line 261
    const/16 v8, 0xa

    .line 262
    .line 263
    invoke-static {v5, v8}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-eqz v9, :cond_3

    .line 279
    .line 280
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    check-cast v9, Lbg/o1;

    .line 285
    .line 286
    iget-object v9, v9, Lbg/o1;->c:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_3
    invoke-virtual {v2, v7}, Lwb/b;->addAll(Ljava/util/Collection;)Z

    .line 293
    .line 294
    .line 295
    iget-object v0, v0, Lbg/a2;->u:Ljava/util/List;

    .line 296
    .line 297
    check-cast v0, Ljava/lang/Iterable;

    .line 298
    .line 299
    new-instance v5, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-static {v0, v8}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eqz v7, :cond_4

    .line 317
    .line 318
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    check-cast v7, Lbg/e1;

    .line 323
    .line 324
    iget-object v7, v7, Lbg/e1;->c:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    :cond_5
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_6

    .line 344
    .line 345
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    if-eqz v7, :cond_5

    .line 350
    .line 351
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_6
    invoke-virtual {v2, v0}, Lwb/b;->addAll(Ljava/util/Collection;)Z

    .line 356
    .line 357
    .line 358
    invoke-static {v2}, Lud/b;->g(Lwb/b;)Lwb/b;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v6, Lx0/w0;

    .line 363
    .line 364
    if-eqz v0, :cond_8

    .line 365
    .line 366
    invoke-virtual {v0}, Lwb/b;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_8

    .line 371
    .line 372
    :cond_7
    const/4 v3, 0x0

    .line 373
    goto :goto_6

    .line 374
    :cond_8
    invoke-virtual {v0, v4}, Lwb/b;->listIterator(I)Ljava/util/ListIterator;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    :cond_9
    move-object v2, v0

    .line 379
    check-cast v2, Lh1/z;

    .line 380
    .line 381
    invoke-virtual {v2}, Lh1/z;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-eqz v5, :cond_7

    .line 386
    .line 387
    invoke-virtual {v2}, Lh1/z;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v2, Ljava/lang/String;

    .line 392
    .line 393
    invoke-interface {v6}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    check-cast v5, Ljava/lang/String;

    .line 398
    .line 399
    invoke-static {v2, v5, v3}, Lef/n;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-eqz v2, :cond_9

    .line 404
    .line 405
    :cond_a
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    return-object v0

    .line 410
    :pswitch_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Ljava/util/List;

    .line 416
    .line 417
    check-cast v0, Ljava/util/Collection;

    .line 418
    .line 419
    new-instance v7, Lj9/f;

    .line 420
    .line 421
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v2, Lbg/z;

    .line 424
    .line 425
    iget-object v9, v2, Lbg/z;->d:Ljava/lang/String;

    .line 426
    .line 427
    move-object v10, v6

    .line 428
    check-cast v10, Ljava/lang/String;

    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/16 v15, 0x1f0

    .line 432
    .line 433
    const/16 v8, 0x63

    .line 434
    .line 435
    sget-object v11, Lj9/d0;->b:Lj9/d0;

    .line 436
    .line 437
    const/4 v12, 0x0

    .line 438
    const/4 v13, 0x0

    .line 439
    invoke-direct/range {v7 .. v15}, Lj9/f;-><init>(ILjava/lang/String;Ljava/lang/String;Lj9/d0;Lj9/c0;Ljava/util/ArrayList;Lic/k;I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    return-object v5

    .line 446
    :pswitch_3
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Ljava/util/List;

    .line 452
    .line 453
    check-cast v0, Ljava/util/Collection;

    .line 454
    .line 455
    new-instance v7, Lj9/f;

    .line 456
    .line 457
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v2, Lbg/z;

    .line 460
    .line 461
    iget-object v9, v2, Lbg/z;->d:Ljava/lang/String;

    .line 462
    .line 463
    move-object v13, v6

    .line 464
    check-cast v13, Ljava/util/ArrayList;

    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const/16 v15, 0x170

    .line 468
    .line 469
    const/16 v8, 0x63

    .line 470
    .line 471
    const/4 v10, 0x0

    .line 472
    sget-object v11, Lj9/d0;->b:Lj9/d0;

    .line 473
    .line 474
    const/4 v12, 0x0

    .line 475
    invoke-direct/range {v7 .. v15}, Lj9/f;-><init>(ILjava/lang/String;Ljava/lang/String;Lj9/d0;Lj9/c0;Ljava/util/ArrayList;Lic/k;I)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    return-object v5

    .line 482
    :pswitch_4
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Ljava/util/List;

    .line 488
    .line 489
    check-cast v0, Ljava/util/Collection;

    .line 490
    .line 491
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 492
    .line 493
    move-object v3, v2

    .line 494
    check-cast v3, Ljava/lang/Iterable;

    .line 495
    .line 496
    invoke-static {v0, v3}, Lvb/m;->P(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 497
    .line 498
    .line 499
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    if-eqz v2, :cond_b

    .line 504
    .line 505
    check-cast v6, Lj9/f;

    .line 506
    .line 507
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    :cond_b
    return-object v5

    .line 511
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v0, Lia/b;

    .line 517
    .line 518
    iget-object v4, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v4, Landroid/content/Context;

    .line 521
    .line 522
    check-cast v6, Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    const-string v7, "ctx"

    .line 528
    .line 529
    invoke-static {v4, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    iget-object v0, v0, Lia/b;->b:Lx0/e1;

    .line 533
    .line 534
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    check-cast v7, Landroidx/media3/exoplayer/ExoPlayer;

    .line 539
    .line 540
    if-eqz v7, :cond_c

    .line 541
    .line 542
    goto :goto_7

    .line 543
    :cond_c
    new-instance v7, Lv4/n;

    .line 544
    .line 545
    invoke-direct {v7, v4}, Lv4/n;-><init>(Landroid/content/Context;)V

    .line 546
    .line 547
    .line 548
    new-instance v4, Lj5/q;

    .line 549
    .line 550
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    invoke-direct {v4, v8}, Lj5/q;-><init>(Lcom/cnl/kikoeru/MainApplication;)V

    .line 555
    .line 556
    .line 557
    new-instance v8, Li9/e;

    .line 558
    .line 559
    invoke-direct {v8}, Li9/e;-><init>()V

    .line 560
    .line 561
    .line 562
    iput-object v8, v4, Lj5/q;->b:Ls4/g;

    .line 563
    .line 564
    iget-object v9, v4, Lj5/q;->a:Ld0/y;

    .line 565
    .line 566
    iget-object v10, v9, Ld0/y;->e:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v10, Ls4/g;

    .line 569
    .line 570
    if-eq v8, v10, :cond_d

    .line 571
    .line 572
    iput-object v8, v9, Ld0/y;->e:Ljava/lang/Object;

    .line 573
    .line 574
    iget-object v8, v9, Ld0/y;->c:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v8, Ljava/util/HashMap;

    .line 577
    .line 578
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    .line 579
    .line 580
    .line 581
    iget-object v8, v9, Ld0/y;->d:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v8, Ljava/util/HashMap;

    .line 584
    .line 585
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    .line 586
    .line 587
    .line 588
    :cond_d
    iget-boolean v8, v7, Lv4/n;->t:Z

    .line 589
    .line 590
    xor-int/2addr v8, v3

    .line 591
    invoke-static {v8}, Lp4/c;->i(Z)V

    .line 592
    .line 593
    .line 594
    new-instance v8, Lj5/o;

    .line 595
    .line 596
    invoke-direct {v8, v2, v4}, Lj5/o;-><init>(ILjava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iput-object v8, v7, Lv4/n;->d:Lxa/i;

    .line 600
    .line 601
    iget-boolean v2, v7, Lv4/n;->t:Z

    .line 602
    .line 603
    xor-int/2addr v2, v3

    .line 604
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 605
    .line 606
    .line 607
    iput-boolean v3, v7, Lv4/n;->t:Z

    .line 608
    .line 609
    sget v2, Lp4/c0;->a:I

    .line 610
    .line 611
    new-instance v2, Lv4/v;

    .line 612
    .line 613
    invoke-direct {v2, v7}, Lv4/v;-><init>(Lv4/n;)V

    .line 614
    .line 615
    .line 616
    invoke-static {v6}, Lm4/i0;->b(Ljava/lang/String;)Lm4/i0;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    invoke-static {v3}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-virtual {v2, v3}, Lv4/v;->A0(Ljava/util/List;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2}, Lv4/v;->c()V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2}, Landroidx/lifecycle/q;->k()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    :goto_7
    return-object v5

    .line 637
    :pswitch_6
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v0, Lhf/y;

    .line 643
    .line 644
    new-instance v4, Lh0/d0;

    .line 645
    .line 646
    iget-object v5, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v5, Lc2/x;

    .line 649
    .line 650
    check-cast v6, Lh0/c1;

    .line 651
    .line 652
    const/4 v7, 0x0

    .line 653
    invoke-direct {v4, v5, v6, v7, v3}, Lh0/d0;-><init>(Lc2/x;Lh0/c1;Lyb/c;I)V

    .line 654
    .line 655
    .line 656
    sget-object v8, Lhf/z;->d:Lhf/z;

    .line 657
    .line 658
    invoke-static {v0, v7, v8, v4, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 659
    .line 660
    .line 661
    new-instance v4, Lh0/d0;

    .line 662
    .line 663
    invoke-direct {v4, v5, v6, v7, v2}, Lh0/d0;-><init>(Lc2/x;Lh0/c1;Lyb/c;I)V

    .line 664
    .line 665
    .line 666
    invoke-static {v0, v7, v8, v4, v3}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    return-object v0

    .line 671
    :pswitch_7
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    iget-object v0, v0, Lcom/cnl/kikoeru/data/db/AppDatabase;->q:Lub/p;

    .line 679
    .line 680
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    check-cast v0, Ld9/g;

    .line 685
    .line 686
    new-instance v7, Lc9/a;

    .line 687
    .line 688
    iget-object v2, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 689
    .line 690
    move-object v9, v2

    .line 691
    check-cast v9, Ljava/lang/String;

    .line 692
    .line 693
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 694
    .line 695
    move-object v10, v2

    .line 696
    check-cast v10, Ljava/lang/String;

    .line 697
    .line 698
    move-object v11, v6

    .line 699
    check-cast v11, Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v12

    .line 705
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 706
    .line 707
    .line 708
    move-result-wide v13

    .line 709
    const/4 v8, 0x0

    .line 710
    invoke-direct/range {v7 .. v14}, Lc9/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v7}, Ld9/g;->a(Lc9/a;)V

    .line 714
    .line 715
    .line 716
    return-object v5

    .line 717
    :pswitch_8
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 721
    .line 722
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    iget-object v2, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v2, Lc9/d;

    .line 729
    .line 730
    iget-wide v7, v2, Lc9/d;->c:J

    .line 731
    .line 732
    invoke-static {v7, v8, v0, v4}, Lag/z;->i(JLjava/lang/String;Z)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v3, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 739
    .line 740
    instance-of v4, v0, Lub/m;

    .line 741
    .line 742
    if-nez v4, :cond_e

    .line 743
    .line 744
    move-object v4, v0

    .line 745
    check-cast v4, Lbg/a2;

    .line 746
    .line 747
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 748
    .line 749
    .line 750
    move-result-object v7

    .line 751
    invoke-virtual {v7}, Lcom/cnl/kikoeru/data/db/AppDatabase;->t()Ld9/o;

    .line 752
    .line 753
    .line 754
    move-result-object v7

    .line 755
    iget v2, v2, Lc9/d;->a:I

    .line 756
    .line 757
    invoke-static {v4, v2}, La/a;->X(Lbg/a2;I)Lc9/d;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-virtual {v7, v2}, Ld9/o;->a(Lc9/d;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 765
    .line 766
    .line 767
    :cond_e
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 768
    .line 769
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    if-eqz v0, :cond_f

    .line 774
    .line 775
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 776
    .line 777
    .line 778
    :cond_f
    return-object v5

    .line 779
    :pswitch_9
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    sget-object v0, Lag/z;->a:Ljava/lang/String;

    .line 783
    .line 784
    invoke-static {}, La9/i;->f()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    iget-object v2, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v2, Lc9/c;

    .line 791
    .line 792
    iget-wide v7, v2, Lc9/c;->c:J

    .line 793
    .line 794
    invoke-static {v7, v8, v0, v4}, Lag/z;->i(JLjava/lang/String;Z)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    iget-object v3, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 801
    .line 802
    instance-of v4, v0, Lub/m;

    .line 803
    .line 804
    if-nez v4, :cond_10

    .line 805
    .line 806
    move-object v4, v0

    .line 807
    check-cast v4, Lbg/a2;

    .line 808
    .line 809
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 810
    .line 811
    .line 812
    move-result-object v7

    .line 813
    invoke-virtual {v7}, Lcom/cnl/kikoeru/data/db/AppDatabase;->s()Ld9/m;

    .line 814
    .line 815
    .line 816
    move-result-object v7

    .line 817
    iget v2, v2, Lc9/c;->a:I

    .line 818
    .line 819
    invoke-static {v4, v2}, Lpc/f0;->T(Lbg/a2;I)Lc9/c;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    invoke-virtual {v7, v2}, Ld9/m;->b(Lc9/c;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 827
    .line 828
    .line 829
    :cond_10
    check-cast v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 830
    .line 831
    invoke-static {v0}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    if-eqz v0, :cond_11

    .line 836
    .line 837
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 838
    .line 839
    .line 840
    :cond_11
    return-object v5

    .line 841
    :pswitch_a
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    iget-object v0, v1, Lf7/o;->f:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, Lx0/w0;

    .line 847
    .line 848
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    check-cast v0, Ljava/util/Set;

    .line 853
    .line 854
    check-cast v0, Ljava/lang/Iterable;

    .line 855
    .line 856
    iget-object v2, v1, Lf7/o;->g:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v2, Lf7/q;

    .line 859
    .line 860
    check-cast v6, Lh1/s;

    .line 861
    .line 862
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    :cond_12
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    if-eqz v3, :cond_13

    .line 871
    .line 872
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    check-cast v3, Le7/j;

    .line 877
    .line 878
    invoke-virtual {v2}, Le7/m0;->b()Le7/l;

    .line 879
    .line 880
    .line 881
    move-result-object v4

    .line 882
    iget-object v4, v4, Le7/l;->e:Llf/k0;

    .line 883
    .line 884
    iget-object v4, v4, Llf/k0;->a:Llf/b1;

    .line 885
    .line 886
    invoke-virtual {v4}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    check-cast v4, Ljava/util/List;

    .line 891
    .line 892
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    if-nez v4, :cond_12

    .line 897
    .line 898
    invoke-virtual {v6, v3}, Lh1/s;->contains(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    if-nez v4, :cond_12

    .line 903
    .line 904
    invoke-virtual {v2}, Le7/m0;->b()Le7/l;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    invoke-virtual {v4, v3}, Le7/l;->c(Le7/j;)V

    .line 909
    .line 910
    .line 911
    goto :goto_8

    .line 912
    :cond_13
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
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
.end method
