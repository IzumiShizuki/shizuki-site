.class public Lcom/tencent/bugly/beta/ui/UiManager;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final TEMP_CAN_SHOW_UPGRADE_CHECKER:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/beta/global/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final TEMP_FRAG:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/beta/ui/BaseFrag;",
            ">;"
        }
    .end annotation
.end field

.field public static final TEMP_TOP_SHOW_CHECKER:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/tencent/bugly/beta/global/d;",
            ">;"
        }
    .end annotation
.end field

.field private static upgradeForceChecker:Lcom/tencent/bugly/beta/global/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_FRAG:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_CAN_SHOW_UPGRADE_CHECKER:Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_TOP_SHOW_CHECKER:Ljava/util/Map;

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static declared-synchronized canShowUpgrade()Z
    .locals 8

    .line 1
    const-class v0, Lcom/tencent/bugly/beta/ui/UiManager;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/beta/ui/UiManager;->getTopAct()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_9

    .line 10
    .line 11
    const-string v3, "background"

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_9

    .line 18
    .line 19
    const-string v3, "unknown"

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :cond_0
    :try_start_1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception v3

    .line 37
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_0
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 42
    .line 43
    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->p:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x1

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 53
    .line 54
    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->p:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_2

    .line 81
    .line 82
    if-eqz v3, :cond_1

    .line 83
    .line 84
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 85
    .line 86
    .line 87
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    :cond_2
    monitor-exit v0

    .line 91
    return v5

    .line 92
    :cond_3
    monitor-exit v0

    .line 93
    return v2

    .line 94
    :cond_4
    :try_start_3
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 95
    .line 96
    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->q:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_8

    .line 103
    .line 104
    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 105
    .line 106
    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->q:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_7

    .line 117
    .line 118
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, Ljava/lang/Class;

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-static {v7, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-nez v7, :cond_6

    .line 133
    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 137
    .line 138
    .line 139
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    if-eqz v6, :cond_5

    .line 141
    .line 142
    :cond_6
    monitor-exit v0

    .line 143
    return v2

    .line 144
    :cond_7
    monitor-exit v0

    .line 145
    return v5

    .line 146
    :cond_8
    monitor-exit v0

    .line 147
    return v5

    .line 148
    :cond_9
    :goto_1
    monitor-exit v0

    .line 149
    return v2

    .line 150
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 151
    throw v1
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
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
.end method

.method public static getTopAct()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/info/a;->W:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_1
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/Object;

    .line 21
    .line 22
    const-string v1, "\u65e0\u6cd5\u83b7\u53d6Activity\u4fe1\u606f\uff0c\u8bf7\u5728AndroidManifest.xml\u4e2d\u6dfb\u52a0GET_TASKS\u6743\u9650\uff1a\n<uses-permission android:name=\"android.permission.GET_TASKS\" />\n"

    .line 23
    .line 24
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 28
    return-object v0
    .line 29
.end method

.method public static declared-synchronized show(Lcom/tencent/bugly/beta/ui/BaseFrag;Z)V
    .locals 4

    const-class v0, Lcom/tencent/bugly/beta/ui/UiManager;

    monitor-enter v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x1388

    .line 1
    :try_start_0
    invoke-static {p0, p1, v1, v2, v3}, Lcom/tencent/bugly/beta/ui/UiManager;->show(Lcom/tencent/bugly/beta/ui/BaseFrag;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized show(Lcom/tencent/bugly/beta/ui/BaseFrag;ZZJ)V
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    const-class v3, Lcom/tencent/bugly/beta/ui/UiManager;

    monitor-enter v3

    if-eqz v0, :cond_9

    .line 3
    :try_start_0
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/ui/BaseFrag;->isShowing()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_4

    .line 4
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->hashCode()I

    move-result v4

    .line 5
    instance-of v5, v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/16 v11, 0xb

    if-eqz v5, :cond_4

    .line 6
    sget-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->upgradeForceChecker:Lcom/tencent/bugly/beta/global/d;

    invoke-static {v5}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    .line 7
    move-object v5, v0

    check-cast v5, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    iget-object v5, v5, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->strategyDetail:Lcom/tencent/bugly/proguard/B;

    iget-byte v5, v5, Lcom/tencent/bugly/proguard/B;->l:B

    if-ne v5, v10, :cond_1

    .line 8
    new-instance v5, Lcom/tencent/bugly/beta/global/d;

    .line 9
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    .line 10
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    new-array v15, v6, [Ljava/lang/Object;

    aput-object v0, v15, v9

    aput-object v12, v15, v8

    aput-object v13, v15, v10

    aput-object v14, v15, v7

    const/16 v12, 0xf

    invoke-direct {v5, v12, v15}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    sput-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->upgradeForceChecker:Lcom/tencent/bugly/beta/global/d;

    const-wide/16 v12, 0xbb8

    .line 11
    invoke-static {v5, v12, v13}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    if-nez p1, :cond_3

    .line 12
    invoke-static {}, Lcom/tencent/bugly/beta/ui/UiManager;->canShowUpgrade()Z

    move-result v5

    if-nez v5, :cond_3

    .line 13
    sget-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_CAN_SHOW_UPGRADE_CHECKER:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/tencent/bugly/beta/global/d;

    if-nez v12, :cond_2

    .line 14
    new-instance v12, Lcom/tencent/bugly/beta/global/d;

    .line 15
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    .line 16
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v9

    aput-object v13, v6, v8

    aput-object v14, v6, v10

    aput-object v15, v6, v7

    invoke-direct {v12, v11, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    :cond_2
    invoke-static {v12}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    .line 19
    invoke-static {v12, v1, v2}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-void

    .line 20
    :cond_3
    :try_start_1
    sget-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_CAN_SHOW_UPGRADE_CHECKER:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Runnable;

    invoke-static {v5}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    :cond_4
    if-nez p2, :cond_6

    .line 21
    sget-object v5, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v5, v5, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    invoke-static {v5}, Lcom/tencent/bugly/proguard/ca;->b(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 22
    sget-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_TOP_SHOW_CHECKER:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/tencent/bugly/beta/global/d;

    if-nez v12, :cond_5

    .line 23
    new-instance v12, Lcom/tencent/bugly/beta/global/d;

    .line 24
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    .line 25
    invoke-static/range {p2 .. p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v9

    aput-object v13, v6, v8

    aput-object v14, v6, v10

    aput-object v15, v6, v7

    invoke-direct {v12, v11, v6}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 26
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_5
    invoke-static {v12}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    .line 28
    invoke-static {v12, v1, v2}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return-void

    .line 29
    :cond_6
    :try_start_2
    sget-object v1, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_TOP_SHOW_CHECKER:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v1}, Lcom/tencent/bugly/beta/utils/e;->b(Ljava/lang/Runnable;)V

    .line 30
    new-instance v1, Lcom/tencent/bugly/beta/global/d;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v4, v7, [Ljava/lang/Object;

    sget-object v5, Lcom/tencent/bugly/beta/ui/UiManager;->TEMP_FRAG:Ljava/util/Map;

    aput-object v5, v4, v9

    aput-object v2, v4, v8

    aput-object v0, v4, v10

    const/16 v2, 0x11

    invoke-direct {v1, v2, v4}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 32
    instance-of v2, v0, Lcom/tencent/bugly/beta/ui/BetaActivity;

    if-eqz v2, :cond_7

    .line 33
    move-object v2, v0

    check-cast v2, Lcom/tencent/bugly/beta/ui/BetaActivity;

    iput-object v1, v2, Lcom/tencent/bugly/beta/ui/BetaActivity;->onDestroyRunnable:Ljava/lang/Runnable;

    goto :goto_1

    :cond_7
    const-wide/16 v4, 0x190

    .line 34
    invoke-static {v1, v4, v5}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;J)V

    .line 35
    :goto_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->finish()V

    goto :goto_2

    .line 36
    :cond_8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    monitor-exit v3

    return-void

    :goto_3
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_9
    :goto_4
    monitor-exit v3

    return-void
.end method
