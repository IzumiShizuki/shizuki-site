.class public Lcom/tencent/bugly/beta/Beta;
.super Lcom/tencent/bugly/a;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final TAG_CANCEL_BUTTON:Ljava/lang/String; = "beta_cancel_button"

.field public static final TAG_CONFIRM_BUTTON:Ljava/lang/String; = "beta_confirm_button"

.field public static final TAG_IMG_BANNER:Ljava/lang/String; = "beta_upgrade_banner"

.field public static final TAG_TIP_MESSAGE:Ljava/lang/String; = "beta_tip_message"

.field public static final TAG_TITLE:Ljava/lang/String; = "beta_title"

.field public static final TAG_UPGRADE_FEATURE:Ljava/lang/String; = "beta_upgrade_feature"

.field public static final TAG_UPGRADE_INFO:Ljava/lang/String; = "beta_upgrade_info"

.field private static a:Lcom/tencent/bugly/beta/download/DownloadTask; = null

.field public static activeListener:Lcom/tencent/bugly/beta/upgrade/ActiveListener; = null

.field public static appChannel:Ljava/lang/String; = null

.field public static appVersionCode:I = 0x0

.field public static appVersionName:Ljava/lang/String; = null

.field public static autoCheckAppUpgrade:Z = false

.field public static autoCheckHotfix:Z = false

.field public static autoCheckUpgrade:Z = true

.field public static autoDownloadOn4g:Z = false

.field public static autoDownloadOnWifi:Z = false

.field public static autoInit:Z = true

.field public static autoInstallApk:Z = false

.field public static betaPatchListener:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener; = null

.field public static canAutoDownloadPatch:Z = false

.field public static canAutoPatch:Z = false

.field public static canNotShowUpgradeActs:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field public static canNotifyUserRestart:Z = false

.field public static canShowApkInfo:Z = false

.field public static canShowUpgradeActs:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field public static defaultBannerId:I = 0x0

.field public static dialogFullScreen:Z = false

.field public static downloadListener:Lcom/tencent/bugly/beta/download/DownloadListener; = null

.field public static enableActiveH5Alert:Z = false

.field public static enableHotfix:Z = false

.field public static enableNotification:Z = false

.field public static initDelay:J = 0xbb8L

.field public static initProcessName:Ljava/lang/String; = null

.field public static instance:Lcom/tencent/bugly/beta/Beta; = null

.field public static largeIconId:I = 0x0

.field public static setPatchRestartOnScreenOff:Z = false

.field public static showInterruptedStrategy:Z = true

.field public static smallIconId:I = 0x0

.field public static soBlackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static storageDir:Ljava/io/File; = null

.field public static strNetworkTipsCancelBtn:Ljava/lang/String; = "\u53d6\u6d88"

.field public static strNetworkTipsConfirmBtn:Ljava/lang/String; = "\u7ee7\u7eed\u4e0b\u8f7d"

.field public static strNetworkTipsMessage:Ljava/lang/String; = "\u4f60\u5df2\u5207\u6362\u5230\u79fb\u52a8\u7f51\u7edc\uff0c\u662f\u5426\u7ee7\u7eed\u5f53\u524d\u4e0b\u8f7d\uff1f"

.field public static strNetworkTipsTitle:Ljava/lang/String; = "\u7f51\u7edc\u63d0\u793a"

.field public static strNotificationClickToContinue:Ljava/lang/String; = "\u7ee7\u7eed\u4e0b\u8f7d"

.field public static strNotificationClickToInstall:Ljava/lang/String; = "\u70b9\u51fb\u5b89\u88c5"

.field public static strNotificationClickToRetry:Ljava/lang/String; = "\u70b9\u51fb\u91cd\u8bd5"

.field public static strNotificationClickToView:Ljava/lang/String; = "\u70b9\u51fb\u67e5\u770b"

.field public static strNotificationDownloadError:Ljava/lang/String; = "\u4e0b\u8f7d\u5931\u8d25"

.field public static strNotificationDownloadSucc:Ljava/lang/String; = "\u4e0b\u8f7d\u5b8c\u6210"

.field public static strNotificationDownloading:Ljava/lang/String; = "\u6b63\u5728\u4e0b\u8f7d"

.field public static strNotificationHaveNewVersion:Ljava/lang/String; = "\u6709\u65b0\u7248\u672c"

.field public static strToastCheckUpgradeError:Ljava/lang/String; = "\u68c0\u67e5\u65b0\u7248\u672c\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

.field public static strToastCheckingUpgrade:Ljava/lang/String; = "\u6b63\u5728\u68c0\u67e5\uff0c\u8bf7\u7a0d\u5019..."

.field public static strToastYourAreTheLatestVersion:Ljava/lang/String; = "\u4f60\u5df2\u7ecf\u662f\u6700\u65b0\u7248\u4e86"

.field public static strUpgradeDialogCancelBtn:Ljava/lang/String; = "\u4e0b\u6b21\u518d\u8bf4"

.field public static strUpgradeDialogContinueBtn:Ljava/lang/String; = "\u7ee7\u7eed"

.field public static strUpgradeDialogFeatureLabel:Ljava/lang/String; = "\u66f4\u65b0\u8bf4\u660e"

.field public static strUpgradeDialogFileSizeLabel:Ljava/lang/String; = "\u5305\u5927\u5c0f"

.field public static strUpgradeDialogInstallBtn:Ljava/lang/String; = "\u5b89\u88c5"

.field public static strUpgradeDialogRetryBtn:Ljava/lang/String; = "\u91cd\u8bd5"

.field public static strUpgradeDialogUpdateTimeLabel:Ljava/lang/String; = "\u66f4\u65b0\u65f6\u95f4"

.field public static strUpgradeDialogUpgradeBtn:Ljava/lang/String; = "\u7acb\u5373\u66f4\u65b0"

.field public static strUpgradeDialogVersionLabel:Ljava/lang/String; = "\u7248\u672c"

.field public static tipsDialogLayoutId:I

.field public static upgradeCheckPeriod:J

.field public static upgradeDialogLayoutId:I

.field public static upgradeDialogLifecycleListener:Lcom/tencent/bugly/beta/ui/UILifecycleListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/bugly/beta/ui/UILifecycleListener<",
            "Lcom/tencent/bugly/beta/UpgradeInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static upgradeListener:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

.field public static upgradeStateListener:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/tencent/bugly/beta/Beta;->canShowUpgradeActs:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/tencent/bugly/beta/Beta;->canNotShowUpgradeActs:Ljava/util/List;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->enableNotification:Z

    .line 28
    .line 29
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->autoDownloadOnWifi:Z

    .line 30
    .line 31
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->canShowApkInfo:Z

    .line 32
    .line 33
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->canAutoDownloadPatch:Z

    .line 34
    .line 35
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->canAutoPatch:Z

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    sput-object v2, Lcom/tencent/bugly/beta/Beta;->appVersionName:Ljava/lang/String;

    .line 39
    .line 40
    const/high16 v3, -0x80000000

    .line 41
    .line 42
    sput v3, Lcom/tencent/bugly/beta/Beta;->appVersionCode:I

    .line 43
    .line 44
    sput-object v2, Lcom/tencent/bugly/beta/Beta;->appChannel:Ljava/lang/String;

    .line 45
    .line 46
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->canNotifyUserRestart:Z

    .line 47
    .line 48
    new-instance v3, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    sput-object v3, Lcom/tencent/bugly/beta/Beta;->soBlackList:Ljava/util/List;

    .line 58
    .line 59
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->dialogFullScreen:Z

    .line 60
    .line 61
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->autoInstallApk:Z

    .line 62
    .line 63
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->autoDownloadOn4g:Z

    .line 64
    .line 65
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->setPatchRestartOnScreenOff:Z

    .line 66
    .line 67
    sput-boolean v1, Lcom/tencent/bugly/beta/Beta;->enableActiveH5Alert:Z

    .line 68
    .line 69
    new-instance v0, Lcom/tencent/bugly/beta/Beta;

    .line 70
    .line 71
    invoke-direct {v0}, Lcom/tencent/bugly/beta/Beta;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/tencent/bugly/beta/Beta;->instance:Lcom/tencent/bugly/beta/Beta;

    .line 75
    .line 76
    sput-object v2, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 77
    .line 78
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/a;-><init>()V

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

.method private static a(ZZI)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    if-nez p0, :cond_4

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-ne p2, v1, :cond_6

    .line 11
    .line 12
    :try_start_0
    sget-object p2, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    .line 13
    .line 14
    invoke-virtual {p2, p0, p1, v1}, Lcom/tencent/bugly/proguard/r;->a(ZZI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :goto_0
    const-string v0, "app.upgrade.strategy.bch"

    .line 19
    .line 20
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v1, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iget-wide v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    .line 39
    .line 40
    sub-long/2addr v1, v3

    .line 41
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 42
    .line 43
    iget-wide v3, v0, Lcom/tencent/bugly/beta/global/e;->d:J

    .line 44
    .line 45
    cmp-long v0, v1, v3

    .line 46
    .line 47
    if-lez v0, :cond_3

    .line 48
    .line 49
    :cond_2
    move v2, p0

    .line 50
    move v3, p1

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    const-string v6, ""

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    move v2, p0

    .line 59
    move v3, p1

    .line 60
    :try_start_2
    invoke-virtual/range {v1 .. v6}, Lcom/tencent/bugly/beta/upgrade/d;->a(ZZILcom/tencent/bugly/proguard/B;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_1
    sget-object p0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 65
    .line 66
    invoke-virtual {p0, v2, v3, p2}, Lcom/tencent/bugly/beta/upgrade/d;->a(ZZI)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    move v2, p0

    .line 71
    move v3, p1

    .line 72
    sget-object p0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 73
    .line 74
    invoke-virtual {p0, v2, v3, p2}, Lcom/tencent/bugly/beta/upgrade/d;->a(ZZI)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lcom/tencent/bugly/beta/Beta;->upgradeStateListener:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    new-instance p2, Lcom/tencent/bugly/beta/global/d;

    .line 83
    .line 84
    const/4 v3, 0x2

    .line 85
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    new-array v1, v1, [Ljava/lang/Object;

    .line 94
    .line 95
    aput-object p0, v1, p1

    .line 96
    .line 97
    aput-object v4, v1, v0

    .line 98
    .line 99
    aput-object v2, v1, v3

    .line 100
    .line 101
    const/16 p0, 0x12

    .line 102
    .line 103
    invoke-direct {p2, p0, v1}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    new-instance p0, Lcom/tencent/bugly/beta/global/d;

    .line 111
    .line 112
    new-array p2, v0, [Ljava/lang/Object;

    .line 113
    .line 114
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->strToastCheckingUpgrade:Ljava/lang/String;

    .line 115
    .line 116
    aput-object v0, p2, p1

    .line 117
    .line 118
    const/4 p1, 0x5

    .line 119
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0}, Lcom/tencent/bugly/beta/utils/e;->a(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 127
    move-object p0, v0

    .line 128
    invoke-static {p0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_6

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 135
    .line 136
    .line 137
    :cond_6
    return-void
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
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

.method public static applyDownloadedPatch()V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->J:Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applyPatch(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    const-class v1, Lcom/tencent/bugly/beta/Beta;

    .line 41
    .line 42
    const-string v2, "[applyDownloadedPatch] patch file not exist"

    .line 43
    .line 44
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void
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

.method public static applyTinkerPatch(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->applyPatch(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
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

.method public static cancelDownload()V
    .locals 9

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->j:Lcom/tencent/bugly/beta/global/d;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    aget-object v5, v1, v4

    .line 13
    .line 14
    iget-object v6, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 15
    .line 16
    if-ne v5, v6, :cond_0

    .line 17
    .line 18
    aget-object v5, v1, v3

    .line 19
    .line 20
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 21
    .line 22
    if-ne v5, v0, :cond_0

    .line 23
    .line 24
    aget-object v0, v1, v2

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 33
    .line 34
    iget-boolean v1, v1, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    :cond_0
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 39
    .line 40
    new-instance v1, Lcom/tencent/bugly/beta/global/d;

    .line 41
    .line 42
    iget-object v5, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 43
    .line 44
    iget-object v6, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 45
    .line 46
    iget-boolean v7, v0, Lcom/tencent/bugly/beta/upgrade/d;->g:Z

    .line 47
    .line 48
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const/4 v8, 0x3

    .line 53
    new-array v8, v8, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object v5, v8, v4

    .line 56
    .line 57
    aput-object v6, v8, v3

    .line 58
    .line 59
    aput-object v7, v8, v2

    .line 60
    .line 61
    const/16 v2, 0xe

    .line 62
    .line 63
    invoke-direct {v1, v2, v8}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->j:Lcom/tencent/bugly/beta/global/d;

    .line 67
    .line 68
    :cond_1
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->j:Lcom/tencent/bugly/beta/global/d;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/d;->run()V

    .line 73
    .line 74
    .line 75
    return-void
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

.method public static checkAppUpgrade()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1, v0}, Lcom/tencent/bugly/beta/Beta;->a(ZZI)V

    return-void
.end method

.method public static checkAppUpgrade(ZZ)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/beta/Beta;->a(ZZI)V

    return-void
.end method

.method public static checkHotFix()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    invoke-static {v0, v0, v1}, Lcom/tencent/bugly/beta/Beta;->a(ZZI)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public static checkUpgrade()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/Beta;->checkUpgrade(ZZ)V

    return-void
.end method

.method public static checkUpgrade(ZZ)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/beta/Beta;->a(ZZI)V

    return-void
.end method

.method public static cleanTinkerPatch(Z)V
    .locals 2

    .line 1
    const-string v0, "IS_PATCH_ROLL_BACK"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->cleanPatch(Z)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public static downloadPatch()V
    .locals 4

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/r;->a(Lcom/tencent/bugly/proguard/B;)Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iput-object v1, v0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    .line 11
    .line 12
    iget-object v1, v0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v0, v2, v1, v3}, Lcom/tencent/bugly/proguard/r;->a(ILcom/tencent/bugly/proguard/B;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static getAppUpgradeInfo()Lcom/tencent/bugly/beta/UpgradeInfo;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const-string v1, "app.upgrade.strategy.bch"

    .line 4
    .line 5
    :try_start_1
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 12
    .line 13
    iput-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v1, Lcom/tencent/bugly/beta/UpgradeInfo;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/tencent/bugly/beta/UpgradeInfo;-><init>(Lcom/tencent/bugly/proguard/B;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 30
    return-object v0
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
.end method

.method public static getHotfixUpgradeInfo()Lcom/tencent/bugly/beta/UpgradeInfo;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const-string v1, "hotfix.strategy.bch"

    .line 4
    .line 5
    :try_start_1
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 12
    .line 13
    iput-object v1, v0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/bugly/proguard/r;->a:Lcom/tencent/bugly/proguard/r;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/tencent/bugly/proguard/r;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v1, Lcom/tencent/bugly/beta/UpgradeInfo;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/tencent/bugly/beta/UpgradeInfo;-><init>(Lcom/tencent/bugly/proguard/B;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 30
    return-object v0
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
.end method

.method public static getInstance()Lcom/tencent/bugly/beta/Beta;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->instance:Lcom/tencent/bugly/beta/Beta;

    .line 2
    .line 3
    const/16 v1, 0x3ea

    .line 4
    .line 5
    iput v1, v0, Lcom/tencent/bugly/a;->id:I

    .line 6
    .line 7
    const-string v1, "1.5.23"

    .line 8
    .line 9
    iput-object v1, v0, Lcom/tencent/bugly/a;->version:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "G10"

    .line 12
    .line 13
    iput-object v1, v0, Lcom/tencent/bugly/a;->versionKey:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
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

.method public static getStrategyTask()Lcom/tencent/bugly/beta/download/DownloadTask;
    .locals 5

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    const-string v2, "app.upgrade.strategy.bch"

    .line 10
    .line 11
    invoke-static {v2, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 16
    .line 17
    iput-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 18
    .line 19
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 28
    .line 29
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 32
    .line 33
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    .line 38
    .line 39
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 40
    .line 41
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v3, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 48
    .line 49
    iget-object v3, v3, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 50
    .line 51
    iget-object v3, v3, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 52
    .line 53
    iget-object v3, v3, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 54
    .line 55
    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-interface {v0, v1, v2, v4, v3}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 69
    .line 70
    sget-object v1, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 71
    .line 72
    iput-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 73
    .line 74
    :cond_0
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 77
    .line 78
    return-object v0
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

.method public static getUpgradeInfo()Lcom/tencent/bugly/beta/UpgradeInfo;
    .locals 8

    .line 1
    const-string v0, "hotfix.strategy.bch"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 5
    .line 6
    invoke-static {v0, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    const-string v3, "app.upgrade.strategy.bch"

    .line 13
    .line 14
    :try_start_1
    invoke-static {v3, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object v3, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-wide v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    .line 33
    .line 34
    iget-wide v5, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->e:J

    .line 35
    .line 36
    cmp-long v7, v3, v5

    .line 37
    .line 38
    if-lez v7, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    if-eqz v2, :cond_4

    .line 49
    .line 50
    iget-object v2, v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v0, v1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    move-object v0, v2

    .line 58
    :cond_4
    :goto_1
    if-eqz v0, :cond_5

    .line 59
    .line 60
    new-instance v2, Lcom/tencent/bugly/beta/UpgradeInfo;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 63
    .line 64
    invoke-direct {v2, v0}, Lcom/tencent/bugly/beta/UpgradeInfo;-><init>(Lcom/tencent/bugly/proguard/B;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :catch_0
    :cond_5
    return-object v1
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

.method public static declared-synchronized getUpgradeStrategy()Lcom/tencent/bugly/proguard/B;
    .locals 4

    .line 1
    const-class v0, Lcom/tencent/bugly/beta/Beta;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 5
    .line 6
    sget-object v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    const-string v3, "app.upgrade.strategy.bch"

    .line 9
    .line 10
    invoke-static {v3, v2}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 15
    .line 16
    iput-object v2, v1, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, v1, Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;->a:Lcom/tencent/bugly/proguard/B;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/B;->clone()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/tencent/bugly/proguard/B;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-object v1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    :cond_0
    monitor-exit v0

    .line 37
    const/4 v0, 0x0

    .line 38
    return-object v0

    .line 39
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    throw v1
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

.method public static declared-synchronized init(Landroid/content/Context;Z)V
    .locals 9

    const-string v0, "setted upgradeDialogLifecycleListener:%s"

    const-class v1, Lcom/tencent/bugly/beta/Beta;

    monitor-enter v1

    const/4 v2, 0x0

    .line 1
    :try_start_0
    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "Beta init start...."

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/H;->a()Lcom/tencent/bugly/proguard/H;

    move-result-object v3

    sget-object v4, Lcom/tencent/bugly/beta/Beta;->instance:Lcom/tencent/bugly/beta/Beta;

    iget v4, v4, Lcom/tencent/bugly/a;->id:I

    sget v5, Lcom/tencent/bugly/beta/global/e;->a:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    sput v5, Lcom/tencent/bugly/beta/global/e;->a:I

    invoke-virtual {v3, v4, v5}, Lcom/tencent/bugly/proguard/H;->a(II)V

    .line 3
    sget-object v3, Lcom/tencent/bugly/beta/Beta;->initProcessName:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/tencent/bugly/beta/Beta;->initProcessName:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_14

    .line 5
    :cond_0
    :goto_0
    new-array v3, v6, [Ljava/lang/Object;

    sget-object v4, Lcom/tencent/bugly/beta/Beta;->initProcessName:Ljava/lang/String;

    aput-object v4, v3, v2

    const-string v4, "Beta will init at: %s"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 6
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object v3

    iget-object v3, v3, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    .line 7
    new-array v4, v6, [Ljava/lang/Object;

    aput-object v3, v4, v2

    const-string v5, "current process: %s"

    invoke-static {v5, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    sget-object v4, Lcom/tencent/bugly/beta/Beta;->initProcessName:Ljava/lang/String;

    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    monitor-exit v1

    return-void

    .line 9
    :cond_1
    :try_start_1
    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 10
    iget-object v4, v3, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 11
    iget-object p0, v3, Lcom/tencent/bugly/beta/global/e;->y:Ljava/lang/String;

    new-array p1, v6, [Ljava/lang/Object;

    aput-object p0, p1, v2

    const-string p0, "Beta has been initialized [apkMD5 : %s]"

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-void

    .line 12
    :cond_2
    :try_start_2
    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "current upgrade sdk version:1.5.23"

    invoke-static {v5, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->G:Z

    .line 14
    sget-wide v4, Lcom/tencent/bugly/beta/Beta;->upgradeCheckPeriod:J

    const-wide/16 v7, 0x0

    cmp-long p1, v4, v7

    if-gez p1, :cond_3

    .line 15
    new-array p1, v2, [Ljava/lang/Object;

    const-string v4, "upgradeCheckPeriod cannot be negative"

    invoke-static {v4, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_3
    iput-wide v4, v3, Lcom/tencent/bugly/beta/global/e;->d:J

    .line 17
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "setted upgradeCheckPeriod: %d"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 18
    :goto_1
    sget-wide v4, Lcom/tencent/bugly/beta/Beta;->initDelay:J

    cmp-long p1, v4, v7

    if-gez p1, :cond_4

    .line 19
    new-array p1, v2, [Ljava/lang/Object;

    const-string v4, "initDelay cannot be negative"

    invoke-static {v4, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 20
    :cond_4
    iput-wide v4, v3, Lcom/tencent/bugly/beta/global/e;->c:J

    .line 21
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "setted initDelay: %d"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 22
    :goto_2
    sget p1, Lcom/tencent/bugly/beta/Beta;->smallIconId:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_5

    .line 23
    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/tencent/bugly/beta/Beta;->smallIconId:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 24
    sget p1, Lcom/tencent/bugly/beta/Beta;->smallIconId:I

    iput p1, v3, Lcom/tencent/bugly/beta/global/e;->i:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v4, "setted smallIconId: %d"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 25
    :try_start_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v2

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 26
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "smallIconId is not available:\n %s"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 27
    :cond_5
    :goto_3
    sget p1, Lcom/tencent/bugly/beta/Beta;->largeIconId:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz p1, :cond_6

    .line 28
    :try_start_7
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/tencent/bugly/beta/Beta;->largeIconId:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 29
    sget p1, Lcom/tencent/bugly/beta/Beta;->largeIconId:I

    iput p1, v3, Lcom/tencent/bugly/beta/global/e;->j:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    const-string v4, "setted largeIconId: %d"
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 30
    :try_start_9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v2

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :catch_1
    move-exception p1

    .line 31
    :try_start_a
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "largeIconId is not available:\n %s"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 32
    :cond_6
    :goto_4
    sget p1, Lcom/tencent/bugly/beta/Beta;->defaultBannerId:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz p1, :cond_7

    .line 33
    :try_start_b
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/tencent/bugly/beta/Beta;->defaultBannerId:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 34
    sget p1, Lcom/tencent/bugly/beta/Beta;->defaultBannerId:I

    iput p1, v3, Lcom/tencent/bugly/beta/global/e;->k:I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    const-string v4, "setted defaultBannerId: %d"
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 35
    :try_start_d
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v2

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_5

    :catch_2
    move-exception p1

    .line 36
    :try_start_e
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "defaultBannerId is not available:\n %s"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 37
    :cond_7
    :goto_5
    sget p1, Lcom/tencent/bugly/beta/Beta;->upgradeDialogLayoutId:I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    if-eqz p1, :cond_8

    .line 38
    :try_start_f
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/tencent/bugly/beta/Beta;->upgradeDialogLayoutId:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 39
    sget v4, Lcom/tencent/bugly/beta/Beta;->upgradeDialogLayoutId:I

    iput v4, v3, Lcom/tencent/bugly/beta/global/e;->l:I
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :try_start_10
    const-string v5, "setted upgradeDialogLayoutId: %d"
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 40
    :try_start_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v4, v7, v2

    invoke-static {v5, v7}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 41
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_6

    :catch_3
    move-exception p1

    .line 42
    :try_start_12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "upgradeDialogLayoutId is not available:\n %s"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    :cond_8
    :goto_6
    sget p1, Lcom/tencent/bugly/beta/Beta;->tipsDialogLayoutId:I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    if-eqz p1, :cond_9

    .line 44
    :try_start_13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/tencent/bugly/beta/Beta;->tipsDialogLayoutId:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 45
    sget v4, Lcom/tencent/bugly/beta/Beta;->tipsDialogLayoutId:I

    iput v4, v3, Lcom/tencent/bugly/beta/global/e;->m:I
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :try_start_14
    const-string v5, "setted tipsDialogLayoutId: %d"
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 46
    :try_start_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v4, v7, v2

    invoke-static {v5, v7}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 47
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    goto :goto_7

    :catch_4
    move-exception p1

    .line 48
    :try_start_16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    const-string p1, "tipsDialogLayoutId is not available:\n %s"

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 49
    :cond_9
    :goto_7
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->upgradeDialogLifecycleListener:Lcom/tencent/bugly/beta/ui/UILifecycleListener;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    if-eqz p1, :cond_a

    .line 50
    :try_start_17
    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->n:Lcom/tencent/bugly/beta/ui/UILifecycleListener;

    .line 51
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/bugly/beta/Beta;->upgradeDialogLifecycleListener:Lcom/tencent/bugly/beta/ui/UILifecycleListener;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    goto :goto_8

    :catch_5
    move-exception p1

    .line 52
    :try_start_18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "upgradeDialogLifecycleListener is not available:\n %"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 53
    :cond_a
    :goto_8
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->canShowUpgradeActs:Ljava/util/List;

    if-eqz p1, :cond_d

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_d

    .line 54
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->canShowUpgradeActs:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_b

    .line 55
    iget-object v4, v3, Lcom/tencent/bugly/beta/global/e;->p:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 56
    :cond_c
    iget-object p1, v3, Lcom/tencent/bugly/beta/global/e;->p:Ljava/util/List;

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "setted canShowUpgradeActs: %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 57
    :cond_d
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->canNotShowUpgradeActs:Ljava/util/List;

    if-eqz p1, :cond_10

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_10

    .line 58
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->canNotShowUpgradeActs:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_e

    .line 59
    iget-object v4, v3, Lcom/tencent/bugly/beta/global/e;->q:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 60
    :cond_f
    iget-object p1, v3, Lcom/tencent/bugly/beta/global/e;->q:Ljava/util/List;

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "setted canNotShowUpgradeActs: %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 61
    :cond_10
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->autoCheckUpgrade:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->e:Z

    .line 62
    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->autoCheckAppUpgrade:Z

    iput-boolean v0, v3, Lcom/tencent/bugly/beta/global/e;->f:Z

    .line 63
    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->autoCheckHotfix:Z

    iput-boolean v0, v3, Lcom/tencent/bugly/beta/global/e;->g:Z

    const-string v0, "autoCheckUpgrade %s"

    if-eqz p1, :cond_11

    .line 64
    const-string p1, "is opened"

    goto :goto_b

    :cond_11
    const-string p1, "is closed"

    :goto_b
    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string p1, "autoCheckAppUpgrade %s"

    .line 65
    iget-boolean v0, v3, Lcom/tencent/bugly/beta/global/e;->f:Z

    if-eqz v0, :cond_12

    const-string v0, "is opened"

    goto :goto_c

    :cond_12
    const-string v0, "is closed"

    :goto_c
    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string p1, "autoCheckHotfix %s"

    .line 66
    iget-boolean v0, v3, Lcom/tencent/bugly/beta/global/e;->g:Z

    if-eqz v0, :cond_13

    const-string v0, "is opened"

    goto :goto_d

    :cond_13
    const-string v0, "is closed"

    :goto_d
    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 67
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->autoInstallApk:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->fa:Z

    const-string v0, "autoInstallApk %s"

    if-eqz p1, :cond_14

    .line 68
    const-string p1, "is opened"

    goto :goto_e

    :cond_14
    const-string p1, "is closed"

    :goto_e
    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 69
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->autoDownloadOn4g:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->V:Z

    const-string v0, "autoDownloadOn4g %s"

    if-eqz p1, :cond_15

    .line 70
    const-string p1, "is opened"

    goto :goto_f

    :cond_15
    const-string p1, "is closed"

    :goto_f
    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 71
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->showInterruptedStrategy:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->h:Z

    const-string v0, "showInterruptedStrategy %s"

    if-eqz p1, :cond_16

    .line 72
    const-string p1, "is opened"

    goto :goto_10

    :cond_16
    const-string p1, "is closed"

    :goto_10
    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string p1, "isDIY %s"

    .line 73
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->upgradeListener:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    if-eqz v0, :cond_17

    const-string v0, "is opened"

    goto :goto_11

    :cond_17
    const-string v0, "is closed"

    :goto_11
    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 74
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->storageDir:Ljava/io/File;

    if-eqz p1, :cond_19

    .line 75
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_18

    sget-object p1, Lcom/tencent/bugly/beta/Beta;->storageDir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-nez p1, :cond_18

    .line 76
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->storageDir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "storageDir is not exists: %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_12

    .line 77
    :cond_18
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->storageDir:Ljava/io/File;

    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->o:Ljava/io/File;

    .line 78
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "setted storageDir: %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 79
    :cond_19
    :goto_12
    iget-object p1, v3, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    if-nez p1, :cond_1a

    .line 80
    sget-object p1, Lcom/tencent/bugly/proguard/v;->a:Lcom/tencent/bugly/proguard/v;

    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    .line 81
    :cond_1a
    iget-object p1, v3, Lcom/tencent/bugly/beta/global/e;->x:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1b

    .line 82
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->x:Ljava/lang/String;

    .line 83
    :cond_1b
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->enableNotification:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->T:Z

    .line 84
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableNotification:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "enableNotification %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 85
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->autoDownloadOnWifi:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->U:Z

    .line 86
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->autoDownloadOnWifi:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "autoDownloadOnWifi %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 87
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->canShowApkInfo:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->W:Z

    .line 88
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->canShowApkInfo:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "canShowApkInfo %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 89
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->canAutoPatch:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->X:Z

    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->canAutoPatch:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "canAutoPatch %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 91
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->betaPatchListener:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->Y:Lcom/tencent/bugly/beta/interfaces/BetaPatchListener;

    .line 92
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->appVersionName:Ljava/lang/String;

    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->A:Ljava/lang/String;

    .line 93
    sget p1, Lcom/tencent/bugly/beta/Beta;->appVersionCode:I

    iput p1, v3, Lcom/tencent/bugly/beta/global/e;->z:I

    .line 94
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->canNotifyUserRestart:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->Z:Z

    .line 95
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->canNotifyUserRestart:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "canNotifyUserRestart %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 96
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->canAutoDownloadPatch:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->aa:Z

    .line 97
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->canAutoDownloadPatch:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "canAutoDownloadPatch %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 98
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    iput-boolean p1, v3, Lcom/tencent/bugly/beta/global/e;->ba:Z

    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "enableHotfix %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 100
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->soBlackList:Ljava/util/List;

    if-eqz p1, :cond_1e

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1e

    .line 101
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->soBlackList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1c
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1c

    .line 102
    iget-object v4, v3, Lcom/tencent/bugly/beta/global/e;->ca:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 103
    :cond_1d
    iget-object p1, v3, Lcom/tencent/bugly/beta/global/e;->ca:Ljava/util/List;

    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "setted soBlackList: %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 104
    :cond_1e
    sget-object p1, Lcom/tencent/bugly/beta/Beta;->appChannel:Ljava/lang/String;

    if-eqz p1, :cond_1f

    .line 105
    iput-object p1, v3, Lcom/tencent/bugly/beta/global/e;->R:Ljava/lang/String;

    .line 106
    new-array v0, v6, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "Beta channel %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 107
    :cond_1f
    invoke-virtual {v3, p0}, Lcom/tencent/bugly/beta/global/e;->a(Landroid/content/Context;)V

    .line 108
    sget-object p1, Lcom/tencent/bugly/beta/global/ResBean;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "rb.bch"

    invoke-static {v0, p1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/beta/global/ResBean;

    sput-object p1, Lcom/tencent/bugly/beta/global/ResBean;->a:Lcom/tencent/bugly/beta/global/ResBean;

    if-nez p1, :cond_20

    .line 109
    new-instance p1, Lcom/tencent/bugly/beta/global/ResBean;

    invoke-direct {p1}, Lcom/tencent/bugly/beta/global/ResBean;-><init>()V

    sput-object p1, Lcom/tencent/bugly/beta/global/ResBean;->a:Lcom/tencent/bugly/beta/global/ResBean;

    .line 110
    :cond_20
    sget-object p1, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    sget-object v0, Lcom/tencent/bugly/beta/Beta;->upgradeListener:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    iput-object v0, p1, Lcom/tencent/bugly/beta/upgrade/d;->e:Lcom/tencent/bugly/beta/upgrade/UpgradeListener;

    .line 111
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->upgradeStateListener:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    iput-object v0, p1, Lcom/tencent/bugly/beta/upgrade/d;->f:Lcom/tencent/bugly/beta/upgrade/UpgradeStateListener;

    .line 112
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->downloadListener:Lcom/tencent/bugly/beta/download/DownloadListener;

    iput-object v0, p1, Lcom/tencent/bugly/beta/upgrade/d;->d:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 113
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->getStrategyTask()Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_21

    sget-object p1, Lcom/tencent/bugly/beta/Beta;->downloadListener:Lcom/tencent/bugly/beta/download/DownloadListener;

    if-eqz p1, :cond_21

    .line 114
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->getStrategyTask()Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->d:Lcom/tencent/bugly/beta/download/DownloadListener;

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 115
    :cond_21
    sget-boolean p1, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    if-eqz p1, :cond_22

    .line 116
    new-array p1, v6, [Ljava/lang/Object;

    const-string v0, "1"

    aput-object v0, p1, v2

    const-string v0, "enableHotfix %s"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string p1, "D4"

    const-string v0, "1"

    .line 117
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/ca;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-static {p0}, Lcom/tencent/bugly/proguard/t;->a(Landroid/content/Context;)V

    .line 119
    :cond_22
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 121
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    .line 122
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    iput-object v5, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 123
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    iget-object v5, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    .line 124
    :cond_23
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strToastYourAreTheLatestVersion:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strToastYourAreTheLatestVersion:Ljava/lang/String;

    .line 125
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strToastCheckUpgradeError:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strToastCheckUpgradeError:Ljava/lang/String;

    .line 126
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strToastCheckingUpgrade:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strToastCheckingUpgrade:Ljava/lang/String;

    .line 127
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationDownloading:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationDownloading:Ljava/lang/String;

    .line 128
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationClickToView:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationClickToView:Ljava/lang/String;

    .line 129
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationClickToInstall:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationClickToInstall:Ljava/lang/String;

    .line 130
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationClickToContinue:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationClickToContinue:Ljava/lang/String;

    .line 131
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationClickToRetry:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationClickToRetry:Ljava/lang/String;

    .line 132
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationDownloadSucc:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationDownloadSucc:Ljava/lang/String;

    .line 133
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationDownloadError:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationDownloadError:Ljava/lang/String;

    .line 134
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNotificationHaveNewVersion:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNotificationHaveNewVersion:Ljava/lang/String;

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNetworkTipsMessage:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNetworkTipsMessage:Ljava/lang/String;

    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNetworkTipsTitle:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNetworkTipsTitle:Ljava/lang/String;

    .line 137
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNetworkTipsConfirmBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNetworkTipsConfirmBtn:Ljava/lang/String;

    .line 138
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strNetworkTipsCancelBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strNetworkTipsCancelBtn:Ljava/lang/String;

    .line 139
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogVersionLabel:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogVersionLabel:Ljava/lang/String;

    .line 140
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogFileSizeLabel:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogFileSizeLabel:Ljava/lang/String;

    .line 141
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogUpdateTimeLabel:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogUpdateTimeLabel:Ljava/lang/String;

    .line 142
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogFeatureLabel:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogFeatureLabel:Ljava/lang/String;

    .line 143
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogUpgradeBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogUpgradeBtn:Ljava/lang/String;

    .line 144
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogInstallBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogInstallBtn:Ljava/lang/String;

    .line 145
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogRetryBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogRetryBtn:Ljava/lang/String;

    .line 146
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogContinueBtn:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogContinueBtn:Ljava/lang/String;

    .line 147
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v5, Lcom/tencent/bugly/beta/R$string;->strUpgradeDialogCancelBtn:I

    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/tencent/bugly/beta/Beta;->strUpgradeDialogCancelBtn:Ljava/lang/String;

    .line 148
    :cond_24
    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 149
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    move-result-object p0

    new-instance p1, Lcom/tencent/bugly/beta/global/d;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-direct {p1, v6, v0}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    iget-wide v3, v3, Lcom/tencent/bugly/beta/global/e;->c:J

    invoke-virtual {p0, p1, v3, v4}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;J)Z

    .line 150
    invoke-static {}, Lcom/tencent/bugly/proguard/H;->a()Lcom/tencent/bugly/proguard/H;

    move-result-object p0

    sget-object p1, Lcom/tencent/bugly/beta/Beta;->instance:Lcom/tencent/bugly/beta/Beta;

    iget p1, p1, Lcom/tencent/bugly/a;->id:I

    sget v0, Lcom/tencent/bugly/beta/global/e;->a:I

    sub-int/2addr v0, v6

    sput v0, Lcom/tencent/bugly/beta/global/e;->a:I

    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/H;->a(II)V

    .line 151
    new-array p0, v2, [Ljava/lang/Object;

    const-string p1, "Beta init finished..."

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    monitor-exit v1

    return-void

    :goto_14
    :try_start_19
    monitor-exit v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    throw p0
.end method

.method public static declared-synchronized installApk(Ljava/io/File;)V
    .locals 13

    .line 1
    const-class v1, Lcom/tencent/bugly/beta/Beta;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->getUpgradeStrategy()Lcom/tencent/bugly/proguard/B;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v2, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 11
    .line 12
    iget-object v2, v2, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v3, v0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 15
    .line 16
    iget-object v3, v3, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, p0, v3}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    sget-object p0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 25
    .line 26
    new-instance v2, Lcom/tencent/bugly/proguard/z;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :try_start_1
    const-string v3, "install"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    iget-object v9, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 35
    .line 36
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 37
    .line 38
    iget v11, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const-wide/16 v7, 0x0

    .line 43
    .line 44
    invoke-direct/range {v2 .. v12}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_0
    :goto_0
    monitor-exit v1

    .line 60
    return-void

    .line 61
    :goto_1
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 62
    throw p0
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

.method public static installTinker()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    .line 2
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerApplicationLike;->getTinkerPatchApplicationLike()Lcom/tencent/tinker/entry/ApplicationLike;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/beta/Beta;->installTinker(Ljava/lang/Object;)V

    return-void
.end method

.method public static installTinker(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x1

    .line 3
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    .line 4
    sget-boolean v1, Lcom/tencent/bugly/beta/Beta;->setPatchRestartOnScreenOff:Z

    invoke-static {v1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->setPatchRestartOnScreenOff(Z)V

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-boolean v2, Lcom/tencent/bugly/beta/Beta;->setPatchRestartOnScreenOff:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "setPatchRestartOnScreenOff %s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 6
    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->installTinker(Ljava/lang/Object;)V

    return-void
.end method

.method public static installTinker(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lcom/tencent/bugly/beta/Beta;->enableHotfix:Z

    .line 8
    invoke-static/range {p0 .. p5}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->installTinker(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/tencent/bugly/beta/tinker/TinkerManager$TinkerPatchResultListener;Ljava/lang/Object;)V

    return-void
.end method

.method public static loadArmLibrary(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->loadArmLibrary(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static loadArmV7Library(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->loadArmV7Library(Landroid/content/Context;Ljava/lang/String;)V

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

.method public static loadLibrary(Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "lib/"

    .line 2
    .line 3
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 4
    .line 5
    const-string v2, "LoadSoFileResult"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz p0, :cond_4

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v4, 0x1

    .line 18
    invoke-static {v2, v4}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_3

    .line 23
    .line 24
    invoke-static {v2, v3}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    const-string v5, ""

    .line 28
    .line 29
    :try_start_1
    invoke-static {p0, v5}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    const-string v6, "PatchResult"

    .line 34
    .line 35
    :try_start_2
    invoke-static {v6, v3}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    new-instance v6, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {v1, v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->loadLibraryFromTinker(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    const/4 v0, 0x0

    .line 69
    :goto_0
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-static {v2, v4}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 79
    .line 80
    .line 81
    const-string p0, "IS_PATCH_ROLL_BACK"

    .line 82
    .line 83
    :try_start_3
    invoke-static {p0, v4}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4}, Lcom/tencent/bugly/beta/Beta;->cleanTinkerPatch(Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    :goto_1
    const-string p0, "libName is invalid"

    .line 91
    .line 92
    :try_start_4
    new-array v0, v3, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v3}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    return-void
    .line 105
.end method

.method public static loadLibraryFromTinker(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->loadLibraryFromTinker(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

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

.method public static declared-synchronized onUpgradeReceived(Ljava/lang/String;ILjava/lang/String;JIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIJLjava/lang/String;ZZILjava/lang/String;J)V
    .locals 23

    const-class v1, Lcom/tencent/bugly/beta/Beta;

    monitor-enter v1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "IMG_title"

    move-object/from16 v3, p12

    .line 2
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static/range {p13 .. p13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "VAL_style"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v2, Lcom/tencent/bugly/proguard/B;

    new-instance v8, Lcom/tencent/bugly/proguard/y;

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v4, v3, Lcom/tencent/bugly/beta/global/e;->x:Ljava/lang/String;

    const-string v9, ""

    const-string v12, ""

    const-string v14, ""

    const-string v15, ""

    const/4 v5, 0x1

    const-wide/16 v10, 0x1

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v13, p11

    move-object v3, v8

    move/from16 v8, p5

    invoke-direct/range {v3 .. v15}, Lcom/tencent/bugly/proguard/y;-><init>(Ljava/lang/String;BILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v3

    new-instance v9, Lcom/tencent/bugly/proguard/x;

    const-string v19, ""

    const-string v22, ""

    move-object/from16 v18, p8

    move-wide/from16 v20, p9

    move-object/from16 v17, p11

    move-object/from16 v16, v9

    invoke-direct/range {v16 .. v22}, Lcom/tencent/bugly/proguard/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    move-object/from16 v9, v16

    move/from16 v3, p1

    int-to-byte v10, v3

    const-string v15, ""

    const/16 v18, 0x1

    const/16 v21, 0x1

    const/4 v7, 0x0

    const/4 v14, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    move-wide/from16 v5, p3

    move/from16 v11, p14

    move-wide/from16 v12, p15

    move-object/from16 v17, p17

    move-wide/from16 v19, p22

    move-object/from16 v16, v0

    invoke-direct/range {v2 .. v21}, Lcom/tencent/bugly/proguard/B;-><init>(Ljava/lang/String;Ljava/lang/String;JILcom/tencent/bugly/proguard/y;Lcom/tencent/bugly/proguard/x;BIJLcom/tencent/bugly/proguard/x;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IJI)V

    .line 5
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    if-nez p21, :cond_0

    const-string v3, ""

    move-object/from16 p5, v3

    :goto_0
    move/from16 p1, p18

    move/from16 p2, p19

    move/from16 p3, p20

    move-object/from16 p0, v0

    move-object/from16 p4, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    move-object/from16 p5, p21

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/bugly/beta/upgrade/d;->a(ZZILcom/tencent/bugly/proguard/B;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static registerDownloadListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 2
    .line 3
    iput-object p0, v0, Lcom/tencent/bugly/beta/global/e;->t:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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

.method public static declared-synchronized saveInstallEvent(Z)V
    .locals 13

    .line 1
    const-class v1, Lcom/tencent/bugly/beta/Beta;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->getUpgradeStrategy()Lcom/tencent/bugly/proguard/B;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 13
    .line 14
    new-instance v2, Lcom/tencent/bugly/proguard/z;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    :try_start_1
    const-string v3, "install"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    iget-object v9, v0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 23
    .line 24
    iget-object v10, v0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 25
    .line 26
    iget v11, v0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 27
    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    invoke-direct/range {v2 .. v12}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    :try_start_3
    const-string p0, "\u5b89\u88c5\u4e8b\u4ef6\u4fdd\u5b58\u6210\u529f"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    :try_start_4
    new-array v0, v0, [Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p0, v0

    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 53
    .line 54
    .line 55
    :cond_0
    :goto_0
    monitor-exit v1

    .line 56
    return-void

    .line 57
    :goto_1
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 58
    throw p0
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

.method public static declared-synchronized showUpgradeDialog(Ljava/lang/String;ILjava/lang/String;JIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILcom/tencent/bugly/beta/download/DownloadListener;Ljava/lang/Runnable;Ljava/lang/Runnable;Z)V
    .locals 23

    const-class v1, Lcom/tencent/bugly/beta/Beta;

    monitor-enter v1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "IMG_title"

    move-object/from16 v3, p12

    .line 2
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static/range {p13 .. p13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "VAL_style"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v2, Lcom/tencent/bugly/proguard/B;

    new-instance v3, Lcom/tencent/bugly/proguard/y;

    sget-object v4, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v4, v4, Lcom/tencent/bugly/beta/global/e;->x:Ljava/lang/String;

    const-string v9, ""

    const-string v12, ""

    const-string v14, "1.5.23"

    const-string v15, ""

    const/4 v5, 0x1

    const-wide/16 v10, 0x1

    move/from16 v8, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v13, p11

    invoke-direct/range {v3 .. v15}, Lcom/tencent/bugly/proguard/y;-><init>(Ljava/lang/String;BILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v16, Lcom/tencent/bugly/proguard/x;

    const-string v19, ""

    const-string v22, ""

    move-object/from16 v18, p8

    move-wide/from16 v20, p9

    move-object/from16 v17, p11

    invoke-direct/range {v16 .. v22}, Lcom/tencent/bugly/proguard/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    move/from16 v4, p1

    int-to-byte v10, v4

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v19

    const-string v15, ""

    const/16 v18, 0x1

    const/16 v21, 0x1

    const/4 v7, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v4, p2

    move-wide/from16 v5, p3

    move-object v8, v3

    move-object/from16 v9, v16

    move-object/from16 v3, p0

    move-object/from16 v16, v0

    invoke-direct/range {v2 .. v21}, Lcom/tencent/bugly/proguard/B;-><init>(Ljava/lang/String;Ljava/lang/String;JILcom/tencent/bugly/proguard/y;Lcom/tencent/bugly/proguard/x;BIJLcom/tencent/bugly/proguard/x;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IJI)V

    .line 6
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, p8

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/tencent/bugly/beta/download/DownloadTask;->delete(Z)V

    .line 8
    sput-object v3, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    .line 9
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    if-nez v0, :cond_1

    .line 10
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v5, v0, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v6, v2, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v6, v6, Lcom/tencent/bugly/proguard/x;->c:Ljava/lang/String;

    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->w:Ljava/io/File;

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iget-object v7, v2, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    iget-object v7, v7, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 12
    invoke-interface {v5, v6, v0, v3, v7}, Lcom/tencent/bugly/beta/download/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/beta/download/DownloadTask;

    move-result-object v0

    sput-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 13
    invoke-virtual {v0, v4}, Lcom/tencent/bugly/beta/download/DownloadTask;->setDownloadType(I)V

    .line 14
    :cond_1
    sget-object v0, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    move-object/from16 v3, p14

    invoke-virtual {v0, v3}, Lcom/tencent/bugly/beta/download/DownloadTask;->addListener(Lcom/tencent/bugly/beta/download/DownloadListener;)V

    .line 15
    sget-object v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    sget-object v3, Lcom/tencent/bugly/beta/Beta;->a:Lcom/tencent/bugly/beta/download/DownloadTask;

    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->setUpgradeInfo(Lcom/tencent/bugly/proguard/B;Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 16
    sget-object v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    move-object/from16 v3, p15

    iput-object v3, v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->upgradeRunnable:Ljava/lang/Runnable;

    move-object/from16 v3, p16

    .line 17
    iput-object v3, v0, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->cancelRunnable:Ljava/lang/Runnable;

    .line 18
    sget-object v0, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    sget-object v3, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    iget-object v3, v3, Lcom/tencent/bugly/beta/global/e;->s:Lcom/tencent/bugly/beta/download/c;

    iget-object v5, v2, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    invoke-virtual {v0, v3, v5}, Lcom/tencent/bugly/beta/global/f;->a(Lcom/tencent/bugly/beta/download/c;Ljava/util/Map;)V

    const/4 v0, 0x0

    const/4 v3, 0x2

    if-eqz p17, :cond_3

    .line 19
    sget-object v5, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    new-instance v6, Lcom/tencent/bugly/beta/global/d;

    iget-byte v2, v2, Lcom/tencent/bugly/proguard/B;->l:B

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 20
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    sget-object v8, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    aput-object v8, v7, v0

    aput-object v2, v7, v4

    invoke-direct {v6, v3, v7}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    const/16 v0, 0xbb8

    .line 21
    invoke-virtual {v5, v6, v0}, Lcom/tencent/bugly/beta/global/f;->a(Ljava/lang/Runnable;I)V

    goto :goto_3

    .line 22
    :cond_3
    sget-object v5, Lcom/tencent/bugly/beta/global/f;->a:Lcom/tencent/bugly/beta/global/f;

    new-instance v6, Lcom/tencent/bugly/beta/global/d;

    iget-byte v2, v2, Lcom/tencent/bugly/proguard/B;->l:B

    if-ne v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    .line 23
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    sget-object v8, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->instance:Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    aput-object v8, v7, v0

    aput-object v2, v7, v4

    invoke-direct {v6, v3, v7}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 24
    invoke-virtual {v5, v6}, Lcom/tencent/bugly/beta/global/f;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    monitor-exit v1

    return-void

    :goto_4
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static startDownload()Lcom/tencent/bugly/beta/download/DownloadTask;
    .locals 6

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->i:Lcom/tencent/bugly/beta/global/d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/d;->b:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v1, v1, v2

    .line 11
    .line 12
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    :cond_0
    new-instance v1, Lcom/tencent/bugly/beta/global/d;

    .line 17
    .line 18
    iget-object v3, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 19
    .line 20
    iget-object v4, v0, Lcom/tencent/bugly/beta/upgrade/d;->b:Lcom/tencent/bugly/beta/upgrade/BetaGrayStrategy;

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    new-array v5, v5, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object v3, v5, v2

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    aput-object v4, v5, v2

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    invoke-direct {v1, v2, v5}, Lcom/tencent/bugly/beta/global/d;-><init>(I[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, v0, Lcom/tencent/bugly/beta/upgrade/d;->i:Lcom/tencent/bugly/beta/global/d;

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->i:Lcom/tencent/bugly/beta/global/d;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/global/d;->run()V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 47
    .line 48
    return-object v0
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

.method public static unInit()V
    .locals 3

    .line 1
    const-string v0, "IS_PATCH_ROLL_BACK"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/global/a;->a(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/bugly/beta/global/a;->b(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->getInstance()Lcom/tencent/bugly/beta/tinker/TinkerManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerManager;->cleanPatch(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static unregisterDownloadListener()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/upgrade/d;->a:Lcom/tencent/bugly/beta/upgrade/d;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/tencent/bugly/beta/upgrade/d;->c:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/tencent/bugly/beta/global/e;->t:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->removeListener(Lcom/tencent/bugly/beta/download/DownloadListener;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lcom/tencent/bugly/beta/global/e;->t:Lcom/tencent/bugly/beta/download/DownloadListener;

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public getTables()[Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "ge_1002"

    .line 2
    .line 3
    const-string v1, "st_1002"

    .line 4
    .line 5
    const-string v2, "dl_1002"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public declared-synchronized init(Landroid/content/Context;ZLcom/tencent/bugly/BuglyStrategy;)V
    .locals 2

    monitor-enter p0

    .line 152
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    move-result-object p3

    const-string v0, "G10"

    const-string v1, "1.5.23"

    invoke-virtual {p3, v0, v1}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    sget-boolean p3, Lcom/tencent/bugly/beta/Beta;->autoInit:Z

    if-eqz p3, :cond_0

    .line 154
    invoke-static {p1, p2}, Lcom/tencent/bugly/beta/Beta;->init(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onDbDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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

.method public onDbUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v9, "st_1002"

    .line 4
    .line 5
    const-string v10, "_dt"

    .line 6
    .line 7
    const-string v11, "_tm"

    .line 8
    .line 9
    const-string v12, " , "

    .line 10
    .line 11
    const-string v13, "_tp"

    .line 12
    .line 13
    const-string v14, " "

    .line 14
    .line 15
    const-string v15, "_id"

    .line 16
    .line 17
    move/from16 v2, p2

    .line 18
    .line 19
    :goto_0
    move/from16 v3, p3

    .line 20
    .line 21
    if-ge v2, v3, :cond_8

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    if-eq v2, v0, :cond_0

    .line 26
    .line 27
    move/from16 v16, v2

    .line 28
    .line 29
    move-object/from16 v18, v12

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    const-string v5, " CREATE TABLE  IF NOT EXISTS "

    .line 43
    .line 44
    :try_start_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    const-string v5, " ( "

    .line 51
    .line 52
    :try_start_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    .line 60
    .line 61
    const-string v5, "integer"

    .line 62
    .line 63
    :try_start_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 73
    .line 74
    .line 75
    const-string v5, "text"

    .line 76
    .line 77
    :try_start_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 87
    .line 88
    .line 89
    const-string v5, "int"

    .line 90
    .line 91
    :try_start_5
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 101
    .line 102
    .line 103
    const-string v5, "blob"

    .line 104
    .line 105
    :try_start_6
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 106
    .line 107
    .line 108
    const-string v5, ",primary key("

    .line 109
    .line 110
    :try_start_7
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 114
    .line 115
    .line 116
    const-string v5, ","

    .line 117
    .line 118
    :try_start_8
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 122
    .line 123
    .line 124
    const-string v5, " )) "

    .line 125
    .line 126
    :try_start_9
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 127
    .line 128
    .line 129
    const-string v5, "create %s"

    .line 130
    .line 131
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    const/4 v7, 0x1

    .line 136
    new-array v7, v7, [Ljava/lang/Object;

    .line 137
    .line 138
    aput-object v6, v7, v4

    .line 139
    .line 140
    invoke-static {v5, v7}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_1

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    :cond_1
    :goto_1
    const-string v4, "_id = 1002"

    .line 162
    .line 163
    move v5, v2

    .line 164
    const-string v2, "t_pf"

    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    const/4 v3, 0x0

    .line 168
    move v7, v5

    .line 169
    const/4 v5, 0x0

    .line 170
    move-object v8, v6

    .line 171
    move/from16 v16, v7

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    move-object/from16 v17, v8

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    move-object/from16 v18, v12

    .line 178
    .line 179
    move-object/from16 v12, v17

    .line 180
    .line 181
    :try_start_b
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 182
    .line 183
    .line 184
    move-result-object v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 185
    if-nez v6, :cond_2

    .line 186
    .line 187
    if-eqz v6, :cond_8

    .line 188
    .line 189
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_8

    .line 193
    .line 194
    :cond_2
    :goto_2
    :try_start_c
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_4

    .line 199
    .line 200
    new-instance v0, Landroid/content/ContentValues;

    .line 201
    .line 202
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v6, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    const-wide/16 v4, 0x0

    .line 214
    .line 215
    cmp-long v7, v2, v4

    .line 216
    .line 217
    if-lez v7, :cond_3

    .line 218
    .line 219
    invoke-interface {v6, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 224
    .line 225
    .line 226
    move-result-wide v2

    .line 227
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v0, v15, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    goto :goto_4

    .line 237
    :cond_3
    :goto_3
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v0, v11, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v6, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v0, v13, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    invoke-interface {v6, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v0, v10, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v9, v12, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_4
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 279
    .line 280
    .line 281
    goto :goto_6

    .line 282
    :catchall_2
    move-exception v0

    .line 283
    move-object v6, v12

    .line 284
    :goto_4
    :try_start_d
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-nez v2, :cond_5

    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :catchall_3
    move-exception v0

    .line 295
    goto :goto_7

    .line 296
    :cond_5
    :goto_5
    if-eqz v6, :cond_6

    .line 297
    .line 298
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 299
    .line 300
    .line 301
    :cond_6
    :goto_6
    add-int/lit8 v2, v16, 0x1

    .line 302
    .line 303
    move-object/from16 v12, v18

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :goto_7
    if-eqz v6, :cond_7

    .line 308
    .line 309
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 310
    .line 311
    .line 312
    :cond_7
    throw v0

    .line 313
    :cond_8
    :goto_8
    return-void
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
