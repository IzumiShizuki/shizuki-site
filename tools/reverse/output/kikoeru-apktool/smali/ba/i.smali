.class public final synthetic Lba/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lic/k;Lx0/w0;Lhg/b;)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    iput v0, p0, Lba/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/i;->c:Ljava/lang/Object;

    iput-object p2, p0, Lba/i;->b:Ljava/lang/Object;

    iput-object p3, p0, Lba/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lba/i;->a:I

    iput-object p1, p0, Lba/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Lba/i;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls0/i;Lic/a;Ljava/lang/String;Lf3/m;)V
    .locals 0

    .line 3
    const/16 p3, 0xc

    iput p3, p0, Lba/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/i;->c:Ljava/lang/Object;

    iput-object p4, p0, Lba/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lx0/w0;Lr/m1;Lr/m1;)V
    .locals 1

    .line 4
    const/4 v0, 0x7

    iput v0, p0, Lba/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lba/i;->d:Ljava/lang/Object;

    iput-object p3, p0, Lba/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lba/i;->a:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const v3, -0x410876af

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "$this$LazyColumn"

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x1

    .line 16
    sget-object v10, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    iget-object v11, v0, Lba/i;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v12, v0, Lba/i;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v13, v0, Lba/i;->b:Ljava/lang/Object;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v13, Lz9/r;

    .line 28
    .line 29
    move-object/from16 v17, v12

    .line 30
    .line 31
    check-cast v17, La0/g0;

    .line 32
    .line 33
    move-object/from16 v18, v11

    .line 34
    .line 35
    check-cast v18, Le7/a0;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La0/j;

    .line 40
    .line 41
    invoke-static {v1, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v13, Lz9/r;->m:Lx0/e1;

    .line 45
    .line 46
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v15, v2

    .line 51
    check-cast v15, Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    new-instance v5, Lba/v;

    .line 58
    .line 59
    invoke-direct {v5, v4, v15}, Lba/v;-><init>(ILjava/util/List;)V

    .line 60
    .line 61
    .line 62
    new-instance v14, Lu9/g;

    .line 63
    .line 64
    const/16 v19, 0x1

    .line 65
    .line 66
    move-object/from16 v16, v13

    .line 67
    .line 68
    invoke-direct/range {v14 .. v19}, Lu9/g;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    new-instance v4, Lf1/f;

    .line 72
    .line 73
    invoke-direct {v4, v14, v3, v9}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2, v6, v5, v4}, La0/j;->m(ILic/k;Lic/k;Lf1/f;)V

    .line 77
    .line 78
    .line 79
    return-object v10

    .line 80
    :pswitch_0
    check-cast v13, Lx0/w0;

    .line 81
    .line 82
    check-cast v12, Lhf/y;

    .line 83
    .line 84
    check-cast v11, Lz9/r;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, La0/j;

    .line 89
    .line 90
    invoke-static {v1, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    new-instance v5, Lba/v;

    .line 104
    .line 105
    invoke-direct {v5, v2, v3}, Lba/v;-><init>(ILjava/util/List;)V

    .line 106
    .line 107
    .line 108
    new-instance v2, Lba/w;

    .line 109
    .line 110
    invoke-direct {v2, v3, v12, v11, v9}, Lba/w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    new-instance v3, Lf1/f;

    .line 114
    .line 115
    const v7, -0x25b7f321

    .line 116
    .line 117
    .line 118
    invoke-direct {v3, v2, v7, v9}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v4, v6, v5, v3}, La0/j;->m(ILic/k;Lic/k;Lf1/f;)V

    .line 122
    .line 123
    .line 124
    return-object v10

    .line 125
    :pswitch_1
    check-cast v12, Lic/k;

    .line 126
    .line 127
    check-cast v13, Lx0/w0;

    .line 128
    .line 129
    check-cast v11, Lhg/b;

    .line 130
    .line 131
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    invoke-interface {v13, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    sget-object v2, Lz8/n;->a:[Lpc/u;

    .line 142
    .line 143
    aget-object v2, v2, v5

    .line 144
    .line 145
    invoke-virtual {v11, v1, v2}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 146
    .line 147
    .line 148
    if-eqz v12, :cond_0

    .line 149
    .line 150
    invoke-interface {v12, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    :cond_0
    return-object v10

    .line 154
    :pswitch_2
    move-object/from16 v16, v13

    .line 155
    .line 156
    check-cast v16, Lx0/w0;

    .line 157
    .line 158
    move-object v15, v12

    .line 159
    check-cast v15, Luh/y;

    .line 160
    .line 161
    move-object/from16 v17, v11

    .line 162
    .line 163
    check-cast v17, Landroid/view/View;

    .line 164
    .line 165
    move-object/from16 v1, p1

    .line 166
    .line 167
    check-cast v1, La0/j;

    .line 168
    .line 169
    invoke-static {v1, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-interface/range {v16 .. v16}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    move-object v14, v2

    .line 177
    check-cast v14, Ljava/util/List;

    .line 178
    .line 179
    new-instance v2, Lt2/x;

    .line 180
    .line 181
    const/16 v4, 0x17

    .line 182
    .line 183
    invoke-direct {v2, v4}, Lt2/x;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    new-instance v5, Lr/p1;

    .line 191
    .line 192
    const/16 v6, 0xc

    .line 193
    .line 194
    invoke-direct {v5, v6, v2, v14}, Lr/p1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    new-instance v2, Lba/v;

    .line 198
    .line 199
    const/4 v6, 0x4

    .line 200
    invoke-direct {v2, v6, v14}, Lba/v;-><init>(ILjava/util/List;)V

    .line 201
    .line 202
    .line 203
    new-instance v13, Lu9/g;

    .line 204
    .line 205
    const/16 v18, 0x0

    .line 206
    .line 207
    invoke-direct/range {v13 .. v18}, Lu9/g;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    new-instance v6, Lf1/f;

    .line 211
    .line 212
    invoke-direct {v6, v13, v3, v9}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v4, v5, v2, v6}, La0/j;->m(ILic/k;Lic/k;Lf1/f;)V

    .line 216
    .line 217
    .line 218
    return-object v10

    .line 219
    :pswitch_3
    check-cast v13, Ls0/i;

    .line 220
    .line 221
    check-cast v12, Lic/a;

    .line 222
    .line 223
    check-cast v11, Lf3/m;

    .line 224
    .line 225
    move-object/from16 v1, p1

    .line 226
    .line 227
    check-cast v1, Lx0/f0;

    .line 228
    .line 229
    iget-object v1, v13, Ls0/i;->k:Landroid/view/WindowManager;

    .line 230
    .line 231
    iget-object v2, v13, Ls0/i;->l:Landroid/view/WindowManager$LayoutParams;

    .line 232
    .line 233
    invoke-interface {v1, v13, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v13, v12, v11}, Ls0/i;->i(Lic/a;Lf3/m;)V

    .line 237
    .line 238
    .line 239
    new-instance v1, Lb0/h0;

    .line 240
    .line 241
    const/16 v2, 0xf

    .line 242
    .line 243
    invoke-direct {v1, v2, v13}, Lb0/h0;-><init>(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :pswitch_4
    check-cast v13, Lhf/y;

    .line 248
    .line 249
    move-object v3, v12

    .line 250
    check-cast v3, Lbg/p;

    .line 251
    .line 252
    move-object v4, v11

    .line 253
    check-cast v4, Lq9/o;

    .line 254
    .line 255
    move-object/from16 v2, p1

    .line 256
    .line 257
    check-cast v2, Ljava/util/List;

    .line 258
    .line 259
    const-string v1, "it"

    .line 260
    .line 261
    invoke-static {v2, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v1, Lq/q;

    .line 265
    .line 266
    const/4 v6, 0x2

    .line 267
    const/4 v5, 0x0

    .line 268
    invoke-direct/range {v1 .. v6}, Lq/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 269
    .line 270
    .line 271
    invoke-static {v13, v5, v5, v1, v8}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 272
    .line 273
    .line 274
    return-object v10

    .line 275
    :pswitch_5
    check-cast v13, Lhf/y;

    .line 276
    .line 277
    move-object v3, v12

    .line 278
    check-cast v3, Lba/k0;

    .line 279
    .line 280
    move-object v4, v11

    .line 281
    check-cast v4, Lc0/z;

    .line 282
    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    new-instance v1, La0/y;

    .line 292
    .line 293
    const/4 v6, 0x4

    .line 294
    const/4 v5, 0x0

    .line 295
    invoke-direct/range {v1 .. v6}, La0/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 296
    .line 297
    .line 298
    invoke-static {v13, v5, v5, v1, v8}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 299
    .line 300
    .line 301
    return-object v10

    .line 302
    :pswitch_6
    check-cast v13, Lx0/w0;

    .line 303
    .line 304
    check-cast v12, Lx0/w0;

    .line 305
    .line 306
    check-cast v11, Lx0/w0;

    .line 307
    .line 308
    move-object/from16 v1, p1

    .line 309
    .line 310
    check-cast v1, Lp1/b;

    .line 311
    .line 312
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    check-cast v2, Ljava/lang/Number;

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    const/high16 v3, 0x3f800000    # 1.0f

    .line 323
    .line 324
    cmpg-float v2, v2, v3

    .line 325
    .line 326
    if-nez v2, :cond_1

    .line 327
    .line 328
    const/high16 v2, 0x40000000    # 2.0f

    .line 329
    .line 330
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-interface {v13, v3}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v12}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    check-cast v3, Lp1/b;

    .line 342
    .line 343
    iget-wide v3, v3, Lp1/b;->a:J

    .line 344
    .line 345
    invoke-static {v2, v3, v4}, Lp1/b;->b(FJ)J

    .line 346
    .line 347
    .line 348
    move-result-wide v2

    .line 349
    iget-wide v4, v1, Lp1/b;->a:J

    .line 350
    .line 351
    invoke-static {v2, v3, v4, v5}, Lp1/b;->h(JJ)J

    .line 352
    .line 353
    .line 354
    move-result-wide v1

    .line 355
    new-instance v3, Lp1/b;

    .line 356
    .line 357
    invoke-direct {v3, v1, v2}, Lp1/b;-><init>(J)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v11, v3}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    goto :goto_0

    .line 364
    :cond_1
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-interface {v13, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    new-instance v1, Lp1/b;

    .line 372
    .line 373
    const-wide/16 v2, 0x0

    .line 374
    .line 375
    invoke-direct {v1, v2, v3}, Lp1/b;-><init>(J)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v11, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :goto_0
    return-object v10

    .line 382
    :pswitch_7
    check-cast v13, Lhf/y;

    .line 383
    .line 384
    check-cast v12, Lu/o0;

    .line 385
    .line 386
    check-cast v11, Lx0/w0;

    .line 387
    .line 388
    move-object/from16 v1, p1

    .line 389
    .line 390
    check-cast v1, Lp1/b;

    .line 391
    .line 392
    new-instance v1, Llf/w0;

    .line 393
    .line 394
    invoke-direct {v1, v12, v11, v6, v8}, Llf/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 395
    .line 396
    .line 397
    invoke-static {v13, v6, v6, v1, v8}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 398
    .line 399
    .line 400
    return-object v10

    .line 401
    :pswitch_8
    check-cast v13, Lx0/w0;

    .line 402
    .line 403
    check-cast v11, Lx0/n2;

    .line 404
    .line 405
    check-cast v12, Lx0/n2;

    .line 406
    .line 407
    move-object/from16 v1, p1

    .line 408
    .line 409
    check-cast v1, Lq1/i0;

    .line 410
    .line 411
    invoke-interface {v11}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, Ljava/lang/Number;

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-virtual {v1, v2}, Lq1/i0;->f(F)V

    .line 422
    .line 423
    .line 424
    invoke-interface {v11}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    check-cast v2, Ljava/lang/Number;

    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-virtual {v1, v2}, Lq1/i0;->g(F)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v12}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    check-cast v2, Ljava/lang/Number;

    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v1, v2}, Lq1/i0;->b(F)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v13}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    check-cast v2, Lq1/p0;

    .line 455
    .line 456
    iget-wide v2, v2, Lq1/p0;->a:J

    .line 457
    .line 458
    invoke-virtual {v1, v2, v3}, Lq1/i0;->k(J)V

    .line 459
    .line 460
    .line 461
    return-object v10

    .line 462
    :pswitch_9
    check-cast v13, Ljava/lang/String;

    .line 463
    .line 464
    check-cast v12, Lm0/t2;

    .line 465
    .line 466
    check-cast v11, Lhf/y;

    .line 467
    .line 468
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, Lq2/k;

    .line 471
    .line 472
    sget-object v2, Lq2/v;->a:[Lpc/u;

    .line 473
    .line 474
    sget-object v2, Lq2/t;->d:Lq2/w;

    .line 475
    .line 476
    sget-object v3, Lq2/v;->a:[Lpc/u;

    .line 477
    .line 478
    const/4 v4, 0x2

    .line 479
    aget-object v3, v3, v4

    .line 480
    .line 481
    invoke-virtual {v2, v1, v13}, Lq2/w;->a(Lq2/k;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    iget-object v2, v12, Lm0/t2;->a:Lm0/x;

    .line 485
    .line 486
    iget-object v2, v2, Lm0/x;->g:Lx0/e1;

    .line 487
    .line 488
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    check-cast v2, Lm0/u2;

    .line 493
    .line 494
    sget-object v3, Lm0/u2;->b:Lm0/u2;

    .line 495
    .line 496
    if-ne v2, v3, :cond_2

    .line 497
    .line 498
    new-instance v2, La9/d;

    .line 499
    .line 500
    const/16 v3, 0x14

    .line 501
    .line 502
    invoke-direct {v2, v3, v12, v11, v5}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 503
    .line 504
    .line 505
    invoke-static {v1, v2}, Lq2/v;->b(Lq2/k;Lic/a;)V

    .line 506
    .line 507
    .line 508
    :cond_2
    return-object v10

    .line 509
    :pswitch_a
    check-cast v13, Lg2/x0;

    .line 510
    .line 511
    check-cast v12, Lm0/f2;

    .line 512
    .line 513
    check-cast v11, Lg2/g1;

    .line 514
    .line 515
    move-object/from16 v1, p1

    .line 516
    .line 517
    check-cast v1, Lg2/f1;

    .line 518
    .line 519
    invoke-interface {v13}, Lg2/y;->O()Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_3

    .line 524
    .line 525
    iget-object v2, v12, Lm0/f2;->o:Lm0/x;

    .line 526
    .line 527
    invoke-virtual {v2}, Lm0/x;->d()Lm0/a4;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    iget-object v3, v12, Lm0/f2;->o:Lm0/x;

    .line 532
    .line 533
    iget-object v3, v3, Lm0/x;->h:Lx0/c0;

    .line 534
    .line 535
    invoke-virtual {v3}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v2, v3}, Lm0/a4;->c(Ljava/lang/Object;)F

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    goto :goto_1

    .line 544
    :cond_3
    iget-object v2, v12, Lm0/f2;->o:Lm0/x;

    .line 545
    .line 546
    invoke-virtual {v2}, Lm0/x;->f()F

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    :goto_1
    iget-object v3, v12, Lm0/f2;->q:Lu/e1;

    .line 551
    .line 552
    sget-object v4, Lu/e1;->b:Lu/e1;

    .line 553
    .line 554
    const/4 v5, 0x0

    .line 555
    if-ne v3, v4, :cond_4

    .line 556
    .line 557
    move v4, v2

    .line 558
    goto :goto_2

    .line 559
    :cond_4
    const/4 v4, 0x0

    .line 560
    :goto_2
    sget-object v6, Lu/e1;->a:Lu/e1;

    .line 561
    .line 562
    if-ne v3, v6, :cond_5

    .line 563
    .line 564
    goto :goto_3

    .line 565
    :cond_5
    const/4 v2, 0x0

    .line 566
    :goto_3
    invoke-static {v4}, Llc/b;->R(F)I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    invoke-static {v2}, Llc/b;->R(F)I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    invoke-static {v1, v11, v3, v2}, Lg2/f1;->i(Lg2/f1;Lg2/g1;II)V

    .line 575
    .line 576
    .line 577
    return-object v10

    .line 578
    :pswitch_b
    check-cast v13, Lg1/e;

    .line 579
    .line 580
    check-cast v11, Lg1/j;

    .line 581
    .line 582
    move-object/from16 v1, p1

    .line 583
    .line 584
    check-cast v1, Lx0/f0;

    .line 585
    .line 586
    iget-object v1, v13, Lg1/e;->b:Lo/k0;

    .line 587
    .line 588
    invoke-virtual {v1, v12}, Lo/k0;->b(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    if-nez v2, :cond_6

    .line 593
    .line 594
    iget-object v2, v13, Lg1/e;->a:Ljava/util/Map;

    .line 595
    .line 596
    invoke-interface {v2, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v12, v11}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    new-instance v1, Lf7/m;

    .line 603
    .line 604
    invoke-direct {v1, v13, v12, v11, v9}, Lf7/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 605
    .line 606
    .line 607
    return-object v1

    .line 608
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 609
    .line 610
    const-string v2, "Key "

    .line 611
    .line 612
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v2, " was used multiple times "

    .line 619
    .line 620
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 628
    .line 629
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    throw v2

    .line 637
    :pswitch_c
    check-cast v13, Lh1/s;

    .line 638
    .line 639
    check-cast v12, Le7/j;

    .line 640
    .line 641
    check-cast v11, Lf7/q;

    .line 642
    .line 643
    move-object/from16 v1, p1

    .line 644
    .line 645
    check-cast v1, Lx0/f0;

    .line 646
    .line 647
    invoke-virtual {v13, v12}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    new-instance v1, Lf7/m;

    .line 651
    .line 652
    invoke-direct {v1, v11, v12, v13, v5}, Lf7/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 653
    .line 654
    .line 655
    return-object v1

    .line 656
    :pswitch_d
    check-cast v13, Ld/j0;

    .line 657
    .line 658
    check-cast v12, Landroidx/lifecycle/x;

    .line 659
    .line 660
    check-cast v11, Le/k;

    .line 661
    .line 662
    move-object/from16 v1, p1

    .line 663
    .line 664
    check-cast v1, Lx0/f0;

    .line 665
    .line 666
    invoke-virtual {v13, v12, v11}, Ld/j0;->a(Landroidx/lifecycle/x;Ld/b0;)V

    .line 667
    .line 668
    .line 669
    new-instance v1, Lb0/h0;

    .line 670
    .line 671
    invoke-direct {v1, v4, v11}, Lb0/h0;-><init>(ILjava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    return-object v1

    .line 675
    :pswitch_e
    check-cast v13, Ld/j0;

    .line 676
    .line 677
    check-cast v12, Landroidx/lifecycle/x;

    .line 678
    .line 679
    check-cast v11, Le/c;

    .line 680
    .line 681
    move-object/from16 v1, p1

    .line 682
    .line 683
    check-cast v1, Lx0/f0;

    .line 684
    .line 685
    invoke-virtual {v13, v12, v11}, Ld/j0;->a(Landroidx/lifecycle/x;Ld/b0;)V

    .line 686
    .line 687
    .line 688
    new-instance v1, Lb0/h0;

    .line 689
    .line 690
    invoke-direct {v1, v2, v11}, Lb0/h0;-><init>(ILjava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    return-object v1

    .line 694
    :pswitch_f
    check-cast v13, Lo1/i;

    .line 695
    .line 696
    check-cast v12, Lic/k;

    .line 697
    .line 698
    check-cast v11, Lx0/n2;

    .line 699
    .line 700
    move-object/from16 v1, p1

    .line 701
    .line 702
    check-cast v1, Lh0/r0;

    .line 703
    .line 704
    const-string v2, "$this$KeyboardActions"

    .line 705
    .line 706
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    invoke-interface {v11}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    check-cast v1, Ljava/lang/String;

    .line 714
    .line 715
    invoke-interface {v12, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    invoke-static {v13}, Lj2/h0;->c(Lo1/i;)V

    .line 719
    .line 720
    .line 721
    return-object v10

    .line 722
    nop

    .line 723
    :pswitch_data_0
    .packed-switch 0x0
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
