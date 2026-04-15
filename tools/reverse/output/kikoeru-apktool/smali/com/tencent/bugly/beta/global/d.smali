.class public Lcom/tencent/bugly/beta/global/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:I

.field public final b:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/tencent/bugly/beta/global/d;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
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
.method public run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "BetaAct TYPE_actCanShow checking : "

    .line 4
    .line 5
    :try_start_0
    iget v2, v1, Lcom/tencent/bugly/beta/global/d;->a:I

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/high16 v4, 0x10000000

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_14

    .line 19
    .line 20
    :pswitch_0
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 21
    .line 22
    aget-object v2, v0, v9

    .line 23
    .line 24
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    .line 25
    .line 26
    aget-object v0, v0, v8

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 35
    .line 36
    aget-object v3, v3, v7

    .line 37
    .line 38
    check-cast v3, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const/4 v4, -0x1

    .line 45
    if-eq v0, v4, :cond_4

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    if-eq v0, v8, :cond_2

    .line 50
    .line 51
    if-eq v0, v7, :cond_1

    .line 52
    .line 53
    if-eq v0, v6, :cond_0

    .line 54
    .line 55
    goto/16 :goto_14

    .line 56
    .line 57
    :cond_0
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;->onDownloadCompleted(Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto/16 :goto_13

    .line 63
    .line 64
    :cond_1
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;->onUpgrading(Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;->onUpgradeNoVersion(Z)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;->onUpgradeSuccess(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;->onUpgradeFailed(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_1
    :try_start_1
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    new-instance v2, Landroid/content/ComponentName;

    .line 91
    .line 92
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 93
    .line 94
    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 95
    .line 96
    const-class v5, Lcom/tencent/bugly/beta/ui/BetaActivity;

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-direct {v2, v3, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-ne v3, v7, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0, v2, v8, v8}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catch_1
    move-exception v0

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    :goto_0
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 118
    .line 119
    aget-object v2, v0, v9

    .line 120
    .line 121
    check-cast v2, Ljava/util/Map;

    .line 122
    .line 123
    aget-object v3, v0, v8

    .line 124
    .line 125
    check-cast v3, Ljava/lang/Integer;

    .line 126
    .line 127
    aget-object v0, v0, v7

    .line 128
    .line 129
    check-cast v0, Lcom/tencent/bugly/beta/ui/BaseFrag;

    .line 130
    .line 131
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroid/content/Intent;

    .line 135
    .line 136
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 137
    .line 138
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 139
    .line 140
    const-class v3, Lcom/tencent/bugly/beta/ui/BetaActivity;

    .line 141
    .line 142
    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 143
    .line 144
    .line 145
    const-string v2, "frag"

    .line 146
    .line 147
    :try_start_2
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 148
    .line 149
    aget-object v3, v3, v8

    .line 150
    .line 151
    check-cast v3, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 157
    .line 158
    .line 159
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 160
    .line 161
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 162
    .line 163
    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :goto_1
    const-string v2, "\u65e0\u6cd5\u6b63\u5e38\u5f39\u7a97\uff0c\u8bf7\u5728AndroidManifest.xml\u4e2d\u6dfb\u52a0BetaActivity\u58f0\u660e\uff1a\n<activity\n    android:name=\"com.tencent.bugly.beta.ui.BetaActivity\"\n    android:theme=\"@android:style/Theme.Translucent\" />"

    .line 168
    .line 169
    :try_start_3
    new-array v3, v9, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_2a

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_14

    .line 184
    .line 185
    :pswitch_2
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 186
    .line 187
    aget-object v2, v0, v9

    .line 188
    .line 189
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    .line 190
    .line 191
    aget-object v0, v0, v8

    .line 192
    .line 193
    check-cast v0, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    iget-object v4, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 200
    .line 201
    aget-object v7, v4, v7

    .line 202
    .line 203
    check-cast v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 204
    .line 205
    aget-object v4, v4, v6

    .line 206
    .line 207
    check-cast v4, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    iget-object v6, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 214
    .line 215
    aget-object v3, v6, v3

    .line 216
    .line 217
    check-cast v3, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v7, :cond_6

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_6
    new-instance v5, Lcom/tencent/bugly/beta/UpgradeInfo;

    .line 227
    .line 228
    iget-object v6, v7, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 229
    .line 230
    invoke-direct {v5, v6}, Lcom/tencent/bugly/beta/UpgradeInfo;-><init>(Lcom/tencent/bugly/proguard/B;)V

    .line 231
    .line 232
    .line 233
    :goto_2
    invoke-interface {v2, v0, v5, v4, v3}, Lcom/tencent/bugly/beta/upgrade/UpgradeListener;->onUpgrade(ILcom/tencent/bugly/beta/UpgradeInfo;ZZ)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_3
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 238
    .line 239
    aget-object v0, v0, v9

    .line 240
    .line 241
    check-cast v0, Lcom/tencent/bugly/beta/ui/BaseFrag;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/ui/BaseFrag;->isShowing()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_8

    .line 248
    .line 249
    invoke-static {}, Lcom/tencent/bugly/beta/ui/UiManager;->getTopAct()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const-class v2, Lcom/tencent/bugly/beta/ui/BetaActivity;

    .line 254
    .line 255
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_7

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_7
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 267
    .line 268
    aget-object v2, v0, v9

    .line 269
    .line 270
    check-cast v2, Lcom/tencent/bugly/beta/ui/BaseFrag;

    .line 271
    .line 272
    aget-object v0, v0, v8

    .line 273
    .line 274
    check-cast v0, Ljava/lang/Boolean;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 281
    .line 282
    aget-object v3, v3, v7

    .line 283
    .line 284
    check-cast v3, Ljava/lang/Boolean;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    iget-object v4, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 291
    .line 292
    aget-object v4, v4, v6

    .line 293
    .line 294
    check-cast v4, Ljava/lang/Long;

    .line 295
    .line 296
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide v4

    .line 300
    invoke-static {v2, v0, v3, v4, v5}, Lcom/tencent/bugly/beta/ui/UiManager;->show(Lcom/tencent/bugly/beta/ui/BaseFrag;ZZJ)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_8
    :goto_3
    const-wide/16 v2, 0xbb8

    .line 305
    .line 306
    invoke-static {v1, v2, v3}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_4
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 311
    .line 312
    aget-object v2, v0, v9

    .line 313
    .line 314
    check-cast v2, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 315
    .line 316
    aget-object v3, v0, v8

    .line 317
    .line 318
    check-cast v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 319
    .line 320
    aget-object v0, v0, v7

    .line 321
    .line 322
    check-cast v0, Ljava/lang/Boolean;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-eqz v2, :cond_c

    .line 329
    .line 330
    if-nez v3, :cond_9

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_9
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eq v2, v7, :cond_2a

    .line 338
    .line 339
    iput-boolean v9, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 340
    .line 341
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 342
    .line 343
    .line 344
    move-result-wide v4

    .line 345
    iput-wide v4, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 346
    .line 347
    if-nez v0, :cond_a

    .line 348
    .line 349
    iget-object v0, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 350
    .line 351
    iget-byte v0, v0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 352
    .line 353
    if-eq v0, v7, :cond_a

    .line 354
    .line 355
    iget v0, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 356
    .line 357
    add-int/2addr v0, v8

    .line 358
    iput v0, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 359
    .line 360
    :cond_a
    iget-object v0, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 361
    .line 362
    if-eqz v0, :cond_b

    .line 363
    .line 364
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 365
    .line 366
    if-ne v0, v8, :cond_b

    .line 367
    .line 368
    const-string v0, "app.upgrade.strategy.bch"

    .line 369
    .line 370
    :try_start_4
    invoke-static {v0, v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    .line 371
    .line 372
    .line 373
    :cond_b
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 374
    .line 375
    new-instance v4, Lcom/tencent/bugly/proguard/z;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 376
    .line 377
    const-string v5, "pop"

    .line 378
    .line 379
    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 380
    .line 381
    .line 382
    move-result-wide v6

    .line 383
    iget-object v2, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 384
    .line 385
    iget-object v11, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 386
    .line 387
    iget-object v12, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 388
    .line 389
    iget v13, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/4 v8, 0x2

    .line 393
    const-wide/16 v9, 0x0

    .line 394
    .line 395
    invoke-direct/range {v4 .. v14}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v4}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :cond_c
    :goto_4
    const-string v0, "strategyTask or betaStrategy is null"

    .line 403
    .line 404
    :try_start_6
    new-array v2, v9, [Ljava/lang/Object;

    .line 405
    .line 406
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :pswitch_5
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 411
    .line 412
    aget-object v2, v0, v9

    .line 413
    .line 414
    check-cast v2, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 415
    .line 416
    aget-object v0, v0, v8

    .line 417
    .line 418
    check-cast v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 419
    .line 420
    if-eqz v2, :cond_14

    .line 421
    .line 422
    if-nez v0, :cond_d

    .line 423
    .line 424
    goto/16 :goto_6

    .line 425
    .line 426
    :cond_d
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-eqz v4, :cond_f

    .line 431
    .line 432
    if-eq v4, v8, :cond_f

    .line 433
    .line 434
    if-eq v4, v7, :cond_e

    .line 435
    .line 436
    if-eq v4, v6, :cond_f

    .line 437
    .line 438
    if-eq v4, v3, :cond_f

    .line 439
    .line 440
    const/4 v3, 0x5

    .line 441
    if-eq v4, v3, :cond_f

    .line 442
    .line 443
    goto/16 :goto_14

    .line 444
    .line 445
    :cond_e
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->stop()V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :cond_f
    iget-boolean v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 450
    .line 451
    if-nez v3, :cond_10

    .line 452
    .line 453
    iput-boolean v8, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 454
    .line 455
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 456
    .line 457
    .line 458
    move-result-wide v3

    .line 459
    iput-wide v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 460
    .line 461
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 462
    .line 463
    if-eqz v3, :cond_10

    .line 464
    .line 465
    iget v3, v3, Lcom/tencent/bugly/proguard/B;->u:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 466
    .line 467
    if-ne v3, v8, :cond_10

    .line 468
    .line 469
    const-string v3, "app.upgrade.strategy.bch"

    .line 470
    .line 471
    :try_start_7
    invoke-static {v3, v0}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    .line 472
    .line 473
    .line 474
    :cond_10
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-eq v3, v7, :cond_12

    .line 479
    .line 480
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    if-ne v3, v8, :cond_11

    .line 485
    .line 486
    sget-object v3, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 487
    .line 488
    new-instance v9, Lcom/tencent/bugly/proguard/z;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 489
    .line 490
    const-string v10, "pop"

    .line 491
    .line 492
    :try_start_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 493
    .line 494
    .line 495
    move-result-wide v11

    .line 496
    iget-object v4, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 497
    .line 498
    iget-object v5, v4, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 499
    .line 500
    iget-object v6, v4, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 501
    .line 502
    iget v4, v4, Lcom/tencent/bugly/proguard/B;->u:I

    .line 503
    .line 504
    const/16 v19, 0x0

    .line 505
    .line 506
    const/4 v13, 0x4

    .line 507
    const-wide/16 v14, 0x0

    .line 508
    .line 509
    move/from16 v18, v4

    .line 510
    .line 511
    move-object/from16 v16, v5

    .line 512
    .line 513
    move-object/from16 v17, v6

    .line 514
    .line 515
    invoke-direct/range {v9 .. v19}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3, v9}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 519
    .line 520
    .line 521
    goto :goto_5

    .line 522
    :cond_11
    sget-object v3, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 523
    .line 524
    new-instance v9, Lcom/tencent/bugly/proguard/z;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 525
    .line 526
    const-string v10, "pop"

    .line 527
    .line 528
    :try_start_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 529
    .line 530
    .line 531
    move-result-wide v11

    .line 532
    iget-object v4, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 533
    .line 534
    iget-object v5, v4, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 535
    .line 536
    iget-object v6, v4, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 537
    .line 538
    iget v4, v4, Lcom/tencent/bugly/proguard/B;->u:I

    .line 539
    .line 540
    const/16 v19, 0x0

    .line 541
    .line 542
    const/4 v13, 0x3

    .line 543
    const-wide/16 v14, 0x0

    .line 544
    .line 545
    move/from16 v18, v4

    .line 546
    .line 547
    move-object/from16 v16, v5

    .line 548
    .line 549
    move-object/from16 v17, v6

    .line 550
    .line 551
    invoke-direct/range {v9 .. v19}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v3, v9}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 555
    .line 556
    .line 557
    :cond_12
    :goto_5
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    if-ne v3, v8, :cond_13

    .line 562
    .line 563
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 564
    .line 565
    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 566
    .line 567
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    iget-object v5, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 572
    .line 573
    iget-object v5, v5, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 574
    .line 575
    iget-object v5, v5, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 576
    .line 577
    invoke-static {v3, v4, v5}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_13

    .line 582
    .line 583
    sget-object v2, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 584
    .line 585
    new-instance v3, Lcom/tencent/bugly/proguard/z;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 586
    .line 587
    const-string v4, "install"

    .line 588
    .line 589
    :try_start_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 590
    .line 591
    .line 592
    move-result-wide v5

    .line 593
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 594
    .line 595
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 596
    .line 597
    iget-object v11, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 598
    .line 599
    iget v12, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 600
    .line 601
    const/4 v13, 0x0

    .line 602
    const/4 v7, 0x0

    .line 603
    const-wide/16 v8, 0x0

    .line 604
    .line 605
    invoke-direct/range {v3 .. v13}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :cond_13
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 613
    .line 614
    .line 615
    return-void

    .line 616
    :cond_14
    :goto_6
    const-string v0, "strategyTask or betaStrategy is null"

    .line 617
    .line 618
    :try_start_b
    new-array v2, v9, [Ljava/lang/Object;

    .line 619
    .line 620
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_6
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 625
    .line 626
    aget-object v0, v0, v9

    .line 627
    .line 628
    check-cast v0, Ljava/lang/Boolean;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    iget-object v2, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 635
    .line 636
    aget-object v2, v2, v8

    .line 637
    .line 638
    move-object v10, v2

    .line 639
    check-cast v10, Lcom/tencent/bugly/beta/upgrade/a;

    .line 640
    .line 641
    monitor-enter v2
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 642
    if-nez v0, :cond_15

    .line 643
    .line 644
    :try_start_c
    iget-boolean v0, v10, Lcom/tencent/bugly/beta/upgrade/a;->d:Z

    .line 645
    .line 646
    if-nez v0, :cond_15

    .line 647
    .line 648
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 649
    .line 650
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 651
    .line 652
    aput-object v3, v0, v9

    .line 653
    .line 654
    iget v11, v10, Lcom/tencent/bugly/beta/upgrade/a;->b:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 655
    .line 656
    const-string v18, "request is not finished"

    .line 657
    .line 658
    const/4 v12, 0x0

    .line 659
    const-wide/16 v13, 0x0

    .line 660
    .line 661
    const-wide/16 v15, 0x0

    .line 662
    .line 663
    const/16 v17, 0x0

    .line 664
    .line 665
    :try_start_d
    invoke-virtual/range {v10 .. v18}, Lcom/tencent/bugly/beta/upgrade/a;->a(ILcom/tencent/bugly/proguard/qa;JJZLjava/lang/String;)V

    .line 666
    .line 667
    .line 668
    iget-object v0, v10, Lcom/tencent/bugly/beta/upgrade/a;->c:[Ljava/lang/Object;

    .line 669
    .line 670
    aput-object v3, v0, v8

    .line 671
    .line 672
    iput-boolean v9, v10, Lcom/tencent/bugly/beta/upgrade/a;->d:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 673
    .line 674
    const-string v0, "request is not finished"

    .line 675
    .line 676
    :try_start_e
    new-array v3, v9, [Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    goto :goto_7

    .line 682
    :catchall_0
    move-exception v0

    .line 683
    goto :goto_8

    .line 684
    :cond_15
    :goto_7
    monitor-exit v2

    .line 685
    return-void

    .line 686
    :goto_8
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 687
    :try_start_f
    throw v0

    .line 688
    :pswitch_7
    iget-object v2, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 689
    .line 690
    aget-object v3, v2, v9

    .line 691
    .line 692
    check-cast v3, Lcom/tencent/bugly/beta/ui/BaseFrag;

    .line 693
    .line 694
    aget-object v2, v2, v8

    .line 695
    .line 696
    check-cast v2, Ljava/lang/Boolean;

    .line 697
    .line 698
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 699
    .line 700
    .line 701
    move-result v2

    .line 702
    iget-object v4, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 703
    .line 704
    aget-object v4, v4, v7

    .line 705
    .line 706
    check-cast v4, Ljava/lang/Boolean;

    .line 707
    .line 708
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 709
    .line 710
    .line 711
    move-result v4

    .line 712
    iget-object v5, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 713
    .line 714
    aget-object v5, v5, v6

    .line 715
    .line 716
    check-cast v5, Ljava/lang/Long;

    .line 717
    .line 718
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 719
    .line 720
    .line 721
    move-result-wide v5

    .line 722
    invoke-static {v3, v2, v4, v5, v6}, Lcom/tencent/bugly/beta/ui/UiManager;->show(Lcom/tencent/bugly/beta/ui/BaseFrag;ZZJ)V

    .line 723
    .line 724
    .line 725
    new-instance v2, Ljava/lang/StringBuilder;

    .line 726
    .line 727
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 731
    .line 732
    aget-object v0, v0, v9

    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    new-array v2, v9, [Ljava/lang/Object;

    .line 746
    .line 747
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :pswitch_8
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 752
    .line 753
    aget-object v0, v0, v9

    .line 754
    .line 755
    check-cast v0, Ljava/util/List;

    .line 756
    .line 757
    if-eqz v0, :cond_2a

    .line 758
    .line 759
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    :cond_16
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    if-eqz v2, :cond_2a

    .line 768
    .line 769
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    check-cast v2, Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 774
    .line 775
    if-eqz v2, :cond_16

    .line 776
    .line 777
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 778
    .line 779
    aget-object v4, v3, v8

    .line 780
    .line 781
    check-cast v4, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 782
    .line 783
    aget-object v3, v3, v7

    .line 784
    .line 785
    check-cast v3, Ljava/lang/Integer;

    .line 786
    .line 787
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    iget-object v5, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 792
    .line 793
    aget-object v5, v5, v6

    .line 794
    .line 795
    check-cast v5, Ljava/lang/String;

    .line 796
    .line 797
    invoke-interface {v2, v4, v3, v5}, Lcom/tencent/bugly/beta/download/DownloadListener;->onFailed(Lcom/tencent/bugly/beta/download/DownloadTask;ILjava/lang/String;)V

    .line 798
    .line 799
    .line 800
    goto :goto_9

    .line 801
    :pswitch_9
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 802
    .line 803
    aget-object v0, v0, v9

    .line 804
    .line 805
    check-cast v0, Ljava/util/List;

    .line 806
    .line 807
    if-eqz v0, :cond_18

    .line 808
    .line 809
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    :cond_17
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    if-eqz v2, :cond_18

    .line 818
    .line 819
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    check-cast v2, Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 824
    .line 825
    if-eqz v2, :cond_17

    .line 826
    .line 827
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 828
    .line 829
    aget-object v3, v3, v8

    .line 830
    .line 831
    check-cast v3, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 832
    .line 833
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/download/DownloadListener;->onReceive(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 834
    .line 835
    .line 836
    goto :goto_a

    .line 837
    :cond_18
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 838
    .line 839
    aget-object v0, v0, v8

    .line 840
    .line 841
    check-cast v0, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 842
    .line 843
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 844
    .line 845
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->Y:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

    .line 846
    .line 847
    if-eqz v2, :cond_2a

    .line 848
    .line 849
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getDownloadType()I

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    if-ne v2, v6, :cond_2a

    .line 854
    .line 855
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 856
    .line 857
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->Y:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

    .line 858
    .line 859
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSavedLength()J

    .line 860
    .line 861
    .line 862
    move-result-wide v3

    .line 863
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getTotalLength()J

    .line 864
    .line 865
    .line 866
    move-result-wide v5

    .line 867
    invoke-interface {v2, v3, v4, v5, v6}, Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;->onDownloadReceived(JJ)V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :pswitch_a
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 872
    .line 873
    aget-object v0, v0, v9

    .line 874
    .line 875
    check-cast v0, Ljava/util/List;

    .line 876
    .line 877
    if-eqz v0, :cond_2a

    .line 878
    .line 879
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    :cond_19
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    if-eqz v2, :cond_2a

    .line 888
    .line 889
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    check-cast v2, Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 894
    .line 895
    if-eqz v2, :cond_19

    .line 896
    .line 897
    iget-object v3, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 898
    .line 899
    aget-object v3, v3, v8

    .line 900
    .line 901
    check-cast v3, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 902
    .line 903
    invoke-interface {v2, v3}, Lcom/tencent/bugly/beta/download/DownloadListener;->onCompleted(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 904
    .line 905
    .line 906
    goto :goto_b

    .line 907
    :pswitch_b
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 908
    .line 909
    aget-object v0, v0, v9

    .line 910
    .line 911
    check-cast v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 912
    .line 913
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateView()V

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :pswitch_c
    monitor-enter p0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    .line 918
    :try_start_10
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 919
    .line 920
    aget-object v0, v0, v9

    .line 921
    .line 922
    check-cast v0, Ljava/lang/Boolean;

    .line 923
    .line 924
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-nez v0, :cond_1a

    .line 929
    .line 930
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 931
    .line 932
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 933
    .line 934
    aput-object v2, v0, v9

    .line 935
    .line 936
    aget-object v0, v0, v8

    .line 937
    .line 938
    check-cast v0, Ljava/lang/Runnable;

    .line 939
    .line 940
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 941
    .line 942
    .line 943
    goto :goto_c

    .line 944
    :catchall_1
    move-exception v0

    .line 945
    goto :goto_d

    .line 946
    :cond_1a
    :goto_c
    monitor-exit p0

    .line 947
    return-void

    .line 948
    :goto_d
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 949
    :try_start_11
    throw v0

    .line 950
    :pswitch_d
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 951
    .line 952
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 953
    .line 954
    iget-object v2, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 955
    .line 956
    aget-object v2, v2, v9

    .line 957
    .line 958
    check-cast v2, Ljava/lang/String;

    .line 959
    .line 960
    invoke-static {v0, v2}, Lcom/tencent/bugly/beta/utils/f;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    return-void

    .line 964
    :pswitch_e
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 965
    .line 966
    aget-object v2, v0, v9

    .line 967
    .line 968
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 969
    .line 970
    aget-object v3, v0, v8

    .line 971
    .line 972
    check-cast v3, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 973
    .line 974
    aget-object v0, v0, v7

    .line 975
    .line 976
    check-cast v0, Ljava/lang/Boolean;

    .line 977
    .line 978
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    invoke-virtual {v3}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 983
    .line 984
    .line 985
    move-result v3

    .line 986
    if-eq v3, v7, :cond_2a

    .line 987
    .line 988
    iput-boolean v9, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 989
    .line 990
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 991
    .line 992
    .line 993
    move-result-wide v3

    .line 994
    iput-wide v3, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 995
    .line 996
    if-nez v0, :cond_1b

    .line 997
    .line 998
    iget-object v0, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 999
    .line 1000
    iget-byte v0, v0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 1001
    .line 1002
    if-eq v0, v7, :cond_1b

    .line 1003
    .line 1004
    iget v0, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 1005
    .line 1006
    add-int/2addr v0, v8

    .line 1007
    iput v0, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->b:I

    .line 1008
    .line 1009
    :cond_1b
    iget-object v0, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1010
    .line 1011
    if-eqz v0, :cond_1c

    .line 1012
    .line 1013
    iget v0, v0, Lcom/tencent/bugly/proguard/B;->u:I
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    .line 1014
    .line 1015
    if-ne v0, v8, :cond_1c

    .line 1016
    .line 1017
    const-string v0, "app.upgrade.strategy.bch"

    .line 1018
    .line 1019
    :try_start_12
    invoke-static {v0, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    .line 1020
    .line 1021
    .line 1022
    :cond_1c
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 1023
    .line 1024
    new-instance v3, Lcom/tencent/bugly/proguard/z;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_0

    .line 1025
    .line 1026
    const-string v4, "pop"

    .line 1027
    .line 1028
    :try_start_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v5

    .line 1032
    iget-object v2, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1033
    .line 1034
    iget-object v10, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 1035
    .line 1036
    iget-object v11, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 1037
    .line 1038
    iget v12, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 1039
    .line 1040
    const/4 v13, 0x0

    .line 1041
    const/4 v7, 0x2

    .line 1042
    const-wide/16 v8, 0x0

    .line 1043
    .line 1044
    invoke-direct/range {v3 .. v13}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 1048
    .line 1049
    .line 1050
    return-void

    .line 1051
    :pswitch_f
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 1052
    .line 1053
    aget-object v2, v0, v9

    .line 1054
    .line 1055
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 1056
    .line 1057
    aget-object v0, v0, v8

    .line 1058
    .line 1059
    check-cast v0, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 1060
    .line 1061
    iget-boolean v3, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 1062
    .line 1063
    if-nez v3, :cond_1d

    .line 1064
    .line 1065
    iput-boolean v8, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->d:Z

    .line 1066
    .line 1067
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1068
    .line 1069
    .line 1070
    move-result-wide v3

    .line 1071
    iput-wide v3, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->c:J

    .line 1072
    .line 1073
    iget-object v3, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1074
    .line 1075
    if-eqz v3, :cond_1d

    .line 1076
    .line 1077
    iget v3, v3, Lcom/tencent/bugly/proguard/B;->u:I
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    .line 1078
    .line 1079
    if-ne v3, v8, :cond_1d

    .line 1080
    .line 1081
    const-string v3, "app.upgrade.strategy.bch"

    .line 1082
    .line 1083
    :try_start_14
    invoke-static {v3, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable;)Z

    .line 1084
    .line 1085
    .line 1086
    :cond_1d
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    if-eq v3, v7, :cond_2a

    .line 1091
    .line 1092
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 1093
    .line 1094
    .line 1095
    move-result v0

    .line 1096
    if-ne v0, v8, :cond_1e

    .line 1097
    .line 1098
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 1099
    .line 1100
    new-instance v3, Lcom/tencent/bugly/proguard/z;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    .line 1101
    .line 1102
    const-string v4, "pop"

    .line 1103
    .line 1104
    :try_start_15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v5

    .line 1108
    iget-object v2, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1109
    .line 1110
    iget-object v10, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 1111
    .line 1112
    iget-object v11, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 1113
    .line 1114
    iget v12, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 1115
    .line 1116
    const/4 v13, 0x0

    .line 1117
    const/4 v7, 0x4

    .line 1118
    const-wide/16 v8, 0x0

    .line 1119
    .line 1120
    invoke-direct/range {v3 .. v13}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 1124
    .line 1125
    .line 1126
    return-void

    .line 1127
    :cond_1e
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 1128
    .line 1129
    new-instance v3, Lcom/tencent/bugly/proguard/z;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    .line 1130
    .line 1131
    const-string v4, "pop"

    .line 1132
    .line 1133
    :try_start_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v5

    .line 1137
    iget-object v2, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1138
    .line 1139
    iget-object v10, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 1140
    .line 1141
    iget-object v11, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 1142
    .line 1143
    iget v12, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 1144
    .line 1145
    const/4 v13, 0x0

    .line 1146
    const/4 v7, 0x3

    .line 1147
    const-wide/16 v8, 0x0

    .line 1148
    .line 1149
    invoke-direct/range {v3 .. v13}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 1153
    .line 1154
    .line 1155
    return-void

    .line 1156
    :pswitch_10
    iget-object v0, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 1157
    .line 1158
    aget-object v2, v0, v9

    .line 1159
    .line 1160
    check-cast v2, Lcom/tencent/bugly/beta/ui/BaseFrag;

    .line 1161
    .line 1162
    aget-object v0, v0, v8

    .line 1163
    .line 1164
    check-cast v0, Ljava/lang/Boolean;

    .line 1165
    .line 1166
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v0

    .line 1170
    invoke-static {v2, v0}, Lcom/tencent/bugly/beta/ui/UiManager;->show(Lcom/tencent/bugly/beta/ui/BaseFrag;Z)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_0

    .line 1171
    .line 1172
    .line 1173
    return-void

    .line 1174
    :pswitch_11
    const-string v0, "Beta async init start..."

    .line 1175
    .line 1176
    :try_start_17
    new-array v2, v9, [Ljava/lang/Object;

    .line 1177
    .line 1178
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 1182
    .line 1183
    monitor-enter v2
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3

    .line 1184
    :try_start_18
    new-instance v0, Ljava/io/File;

    .line 1185
    .line 1186
    iget-object v3, v2, Lcom/tencent/bugly/beta/global/e;->C:Landroid/content/pm/PackageInfo;

    .line 1187
    .line 1188
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1189
    .line 1190
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 1191
    .line 1192
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_2
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    .line 1193
    .line 1194
    .line 1195
    const-string v3, "MD5"

    .line 1196
    .line 1197
    :try_start_19
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    iput-object v0, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_2
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 1202
    .line 1203
    goto :goto_e

    .line 1204
    :catchall_2
    move-exception v0

    .line 1205
    goto/16 :goto_11

    .line 1206
    .line 1207
    :catch_2
    :try_start_1a
    iput-object v5, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    .line 1208
    .line 1209
    :goto_e
    iget-object v0, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    .line 1210
    .line 1211
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    .line 1215
    if-eqz v0, :cond_1f

    .line 1216
    .line 1217
    const-string v0, "null"

    .line 1218
    .line 1219
    :try_start_1b
    iput-object v0, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    .line 1220
    .line 1221
    const-string v0, "\u65e0\u6cd5\u83b7\u53d6md5\u503c"

    .line 1222
    .line 1223
    :try_start_1c
    new-array v3, v9, [Ljava/lang/Object;

    .line 1224
    .line 1225
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    :cond_1f
    iget-boolean v0, v2, Lcom/tencent/bugly/beta/global/e;->F:Z

    .line 1229
    .line 1230
    if-eqz v0, :cond_20

    .line 1231
    .line 1232
    iget-object v0, v2, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 1233
    .line 1234
    invoke-static {v0}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    .line 1235
    .line 1236
    .line 1237
    :cond_20
    const-string v0, "app.upgrade.strategy.bch"

    .line 1238
    .line 1239
    :try_start_1d
    sget-object v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1240
    .line 1241
    invoke-static {v0, v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    check-cast v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 1246
    .line 1247
    if-eqz v0, :cond_25

    .line 1248
    .line 1249
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1250
    .line 1251
    if-eqz v3, :cond_25

    .line 1252
    .line 1253
    iget-object v3, v3, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 1254
    .line 1255
    iget-object v3, v3, Lcom/tencent/bugly/proguard/y;->j:Ljava/lang/String;

    .line 1256
    .line 1257
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v3

    .line 1261
    iget-object v6, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-static {v3, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v3

    .line 1267
    if-eqz v3, :cond_24

    .line 1268
    .line 1269
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1270
    .line 1271
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/B;->c()Ljava/util/Map;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v3
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    .line 1275
    const-string v6, "h5"

    .line 1276
    .line 1277
    :try_start_1e
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    check-cast v3, Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v6

    .line 1287
    if-nez v6, :cond_22

    .line 1288
    .line 1289
    sget-boolean v6, Lcom/tencent/bugly/beta/Beta;->enableActiveH5Alert:Z

    .line 1290
    .line 1291
    if-eqz v6, :cond_21

    .line 1292
    .line 1293
    new-instance v6, Landroid/content/Intent;

    .line 1294
    .line 1295
    sget-object v10, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 1296
    .line 1297
    iget-object v10, v10, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 1298
    .line 1299
    const-class v11, Lcom/tencent/bugly/beta/ui/BetaActiveAlertActivity;

    .line 1300
    .line 1301
    invoke-direct {v6, v10, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 1302
    .line 1303
    .line 1304
    const-string v10, "h5"

    .line 1305
    .line 1306
    :try_start_1f
    iget-object v11, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1307
    .line 1308
    invoke-virtual {v11}, Lcom/tencent/bugly/proguard/B;->c()Ljava/util/Map;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v11
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    .line 1312
    const-string v12, "h5"

    .line 1313
    .line 1314
    :try_start_20
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v11

    .line 1318
    check-cast v11, Ljava/lang/String;

    .line 1319
    .line 1320
    invoke-virtual {v6, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v6, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1324
    .line 1325
    .line 1326
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 1327
    .line 1328
    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 1329
    .line 1330
    invoke-virtual {v4, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1331
    .line 1332
    .line 1333
    :cond_21
    sget-object v4, Lcom/tencent/bugly/beta/Beta;->activeListener:Lcom/tencent/bugly/beta/upgrade/ActiveListener;

    .line 1334
    .line 1335
    if-eqz v4, :cond_22

    .line 1336
    .line 1337
    invoke-interface {v4, v3}, Lcom/tencent/bugly/beta/upgrade/ActiveListener;->onActive(Ljava/lang/String;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_2

    .line 1338
    .line 1339
    .line 1340
    :cond_22
    const-string v3, "app.upgrade.strategy.bch"

    .line 1341
    .line 1342
    :try_start_21
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v3

    .line 1346
    if-eqz v3, :cond_23

    .line 1347
    .line 1348
    sget-object v3, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 1349
    .line 1350
    new-instance v10, Lcom/tencent/bugly/proguard/z;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_2

    .line 1351
    .line 1352
    const-string v11, "active"

    .line 1353
    .line 1354
    :try_start_22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1355
    .line 1356
    .line 1357
    move-result-wide v12

    .line 1358
    iget-object v4, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1359
    .line 1360
    iget-object v6, v4, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 1361
    .line 1362
    iget v4, v4, Lcom/tencent/bugly/proguard/B;->u:I

    .line 1363
    .line 1364
    const/16 v20, 0x0

    .line 1365
    .line 1366
    const/4 v14, 0x0

    .line 1367
    const-wide/16 v15, 0x0

    .line 1368
    .line 1369
    const/16 v17, 0x0

    .line 1370
    .line 1371
    move/from16 v19, v4

    .line 1372
    .line 1373
    move-object/from16 v18, v6

    .line 1374
    .line 1375
    invoke-direct/range {v10 .. v20}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v3, v10}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 1379
    .line 1380
    .line 1381
    iget-object v3, v2, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 1382
    .line 1383
    iget-object v4, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1384
    .line 1385
    iget-object v4, v4, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 1386
    .line 1387
    iget-object v4, v4, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 1388
    .line 1389
    iget-object v6, v2, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 1390
    .line 1391
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v6

    .line 1395
    invoke-interface {v3, v4, v6, v5, v5}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v3

    .line 1399
    invoke-virtual {v3, v8}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v3, v8}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 1403
    .line 1404
    .line 1405
    iget-object v3, v2, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 1406
    .line 1407
    invoke-static {v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/io/File;)V

    .line 1408
    .line 1409
    .line 1410
    sget-object v3, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    .line 1411
    .line 1412
    invoke-virtual {v3}, Lcom/tencent/bugly/beta/global/f;->a()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_2

    .line 1413
    .line 1414
    .line 1415
    const-string v3, "upgrade success"

    .line 1416
    .line 1417
    :try_start_23
    new-array v4, v9, [Ljava/lang/Object;

    .line 1418
    .line 1419
    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_2

    .line 1420
    .line 1421
    .line 1422
    goto :goto_f

    .line 1423
    :cond_23
    const-string v3, "delete strategy failed"

    .line 1424
    .line 1425
    :try_start_24
    new-array v4, v9, [Ljava/lang/Object;

    .line 1426
    .line 1427
    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_2

    .line 1428
    .line 1429
    .line 1430
    :cond_24
    :goto_f
    const-string v3, "[this md5:%s] [strategy md5:%s]"

    .line 1431
    .line 1432
    :try_start_25
    iget-object v4, v2, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    .line 1433
    .line 1434
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 1435
    .line 1436
    iget-object v0, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 1437
    .line 1438
    iget-object v0, v0, Lcom/tencent/bugly/proguard/y;->j:Ljava/lang/String;

    .line 1439
    .line 1440
    new-array v5, v7, [Ljava/lang/Object;

    .line 1441
    .line 1442
    aput-object v4, v5, v9

    .line 1443
    .line 1444
    aput-object v0, v5, v8

    .line 1445
    .line 1446
    invoke-static {v3, v5}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 1447
    .line 1448
    .line 1449
    :cond_25
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 1450
    .line 1451
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 1452
    .line 1453
    .line 1454
    monitor-exit v2
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_2

    .line 1455
    :try_start_26
    iget-object v0, v2, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 1456
    .line 1457
    new-instance v3, Lcom/tencent/bugly/beta/download/BetaReceiver;

    .line 1458
    .line 1459
    invoke-direct {v3}, Lcom/tencent/bugly/beta/download/BetaReceiver;-><init>()V

    .line 1460
    .line 1461
    .line 1462
    new-instance v4, Landroid/content/IntentFilter;
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_3

    .line 1463
    .line 1464
    const-string v5, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 1465
    .line 1466
    :try_start_27
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1470
    .line 1471
    .line 1472
    iget-boolean v0, v2, Lcom/tencent/bugly/beta/global/e;->e:Z

    .line 1473
    .line 1474
    if-eqz v0, :cond_26

    .line 1475
    .line 1476
    invoke-static {v9, v9}, Lcom/tencent/bugly/beta/Beta;->checkUpgrade(ZZ)V

    .line 1477
    .line 1478
    .line 1479
    goto :goto_10

    .line 1480
    :catch_3
    move-exception v0

    .line 1481
    goto :goto_12

    .line 1482
    :cond_26
    iget-boolean v0, v2, Lcom/tencent/bugly/beta/global/e;->g:Z

    .line 1483
    .line 1484
    if-eqz v0, :cond_27

    .line 1485
    .line 1486
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->checkHotFix()V

    .line 1487
    .line 1488
    .line 1489
    :cond_27
    iget-boolean v0, v2, Lcom/tencent/bugly/beta/global/e;->f:Z

    .line 1490
    .line 1491
    if-eqz v0, :cond_28

    .line 1492
    .line 1493
    invoke-static {v9, v9}, Lcom/tencent/bugly/beta/Beta;->checkAppUpgrade(ZZ)V

    .line 1494
    .line 1495
    .line 1496
    :cond_28
    :goto_10
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 1497
    .line 1498
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->H:Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;

    .line 1499
    .line 1500
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaUploadStrategy;->a:Lcom/tencent/bugly/proguard/sa;

    .line 1501
    .line 1502
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/sa;->e:Z

    .line 1503
    .line 1504
    if-eqz v0, :cond_29

    .line 1505
    .line 1506
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 1507
    .line 1508
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/p;->b()Ljava/util/List;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    check-cast v0, Ljava/util/ArrayList;

    .line 1513
    .line 1514
    if-eqz v0, :cond_29

    .line 1515
    .line 1516
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v2

    .line 1520
    if-nez v2, :cond_29

    .line 1521
    .line 1522
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/b;->a:Lcom/tencent/bugly/beta/upgrade/b;

    .line 1523
    .line 1524
    new-instance v3, Lcom/tencent/bugly/proguard/A;

    .line 1525
    .line 1526
    invoke-direct {v3, v0}, Lcom/tencent/bugly/proguard/A;-><init>(Ljava/util/ArrayList;)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v2, v3, v8}, Lcom/tencent/bugly/beta/upgrade/b;->a(Lcom/tencent/bugly/proguard/A;Z)V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_3

    .line 1530
    .line 1531
    .line 1532
    :cond_29
    const-string v0, "Beta async init end..."

    .line 1533
    .line 1534
    :try_start_28
    new-array v2, v9, [Ljava/lang/Object;

    .line 1535
    .line 1536
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_3

    .line 1537
    .line 1538
    .line 1539
    goto :goto_14

    .line 1540
    :goto_11
    :try_start_29
    monitor-exit v2
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_2

    .line 1541
    :try_start_2a
    throw v0
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_3

    .line 1542
    :goto_12
    :try_start_2b
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v2

    .line 1546
    if-nez v2, :cond_2a

    .line 1547
    .line 1548
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_0

    .line 1549
    .line 1550
    .line 1551
    goto :goto_14

    .line 1552
    :goto_13
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 1553
    .line 1554
    .line 1555
    move-result v2

    .line 1556
    if-nez v2, :cond_2a

    .line 1557
    .line 1558
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1559
    .line 1560
    .line 1561
    :cond_2a
    :goto_14
    return-void

    .line 1562
    nop

    :pswitch_data_0
    .packed-switch 0x1
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
.end method
