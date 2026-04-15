.class public Lcom/tencent/bugly/beta/global/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:I

.field final b:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/tencent/bugly/beta/global/b;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

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
.method public onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    :try_start_0
    iget p1, p0, Lcom/tencent/bugly/beta/global/b;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :pswitch_0
    invoke-static {}, Lcom/tencent/bugly/beta/Beta;->getStrategyTask()Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/tencent/bugly/beta/Beta;->installApk(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/beta/Beta;->saveInstallEvent(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    move-object p1, v0

    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :pswitch_1
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 30
    .line 31
    aget-object p1, p1, v1

    .line 32
    .line 33
    check-cast p1, Lcom/tencent/bugly/beta/ui/HotfixDialog;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_2
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 40
    .line 41
    aget-object p1, p1, v1

    .line 42
    .line 43
    check-cast p1, Lcom/tencent/bugly/beta/ui/HotfixDialog;

    .line 44
    .line 45
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_3
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 57
    .line 58
    aget-object p1, p1, v1

    .line 59
    .line 60
    check-cast p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 61
    .line 62
    iget-object v0, p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->cancelRunnable:Ljava/lang/Runnable;

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_4
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 74
    .line 75
    aget-object p1, p1, v1

    .line 76
    .line 77
    check-cast p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 78
    .line 79
    iget-object v0, p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->strategyTask:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 80
    .line 81
    sget-object v1, Lcom/tencent/bugly/beta/download/BetaReceiver;->netListeners:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->getDownloadUrl()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/download/DownloadTask;->stop()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateBtn(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_5
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 98
    .line 99
    aget-object p1, p1, v1

    .line 100
    .line 101
    check-cast p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;

    .line 102
    .line 103
    iget-object v1, p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->strategyTask:Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 104
    .line 105
    iget-object v2, p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->strategyDetail:Lcom/tencent/bugly/proguard/B;

    .line 106
    .line 107
    invoke-static {v1}, Lcom/tencent/bugly/beta/download/BetaReceiver;->addTask(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p1, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->upgradeRunnable:Ljava/lang/Runnable;

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 115
    .line 116
    .line 117
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->getStatus()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-ne v3, v0, :cond_2

    .line 122
    .line 123
    sget-object v0, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 124
    .line 125
    iget-object v0, v0, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->getSaveFile()Ljava/io/File;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    iget-object v4, v2, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 132
    .line 133
    iget-object v4, v4, Lcom/tencent/bugly/proguard/x;->b:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v0, v3, v4}, Lcom/tencent/bugly/beta/global/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    sget-object v0, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 142
    .line 143
    new-instance v3, Lcom/tencent/bugly/proguard/z;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    .line 145
    const-string v4, "install"

    .line 146
    .line 147
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    iget-object v10, v2, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 152
    .line 153
    iget-object v11, v2, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 154
    .line 155
    iget v12, v2, Lcom/tencent/bugly/proguard/B;->u:I

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const-wide/16 v8, 0x0

    .line 160
    .line 161
    invoke-direct/range {v3 .. v13}, Lcom/tencent/bugly/proguard/z;-><init>(Ljava/lang/String;JBJLcom/tencent/bugly/proguard/y;Ljava/lang/String;ILjava/util/Map;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v3}, Lcom/tencent/bugly/proguard/p;->a(Lcom/tencent/bugly/proguard/z;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_2
    invoke-virtual {v1}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    .line 169
    .line 170
    .line 171
    :goto_0
    iget-byte v0, v2, Lcom/tencent/bugly/proguard/B;->l:B

    .line 172
    .line 173
    const/4 v2, 0x2

    .line 174
    if-eq v0, v2, :cond_3

    .line 175
    .line 176
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 177
    .line 178
    .line 179
    :cond_3
    invoke-virtual {p1, v1}, Lcom/tencent/bugly/beta/ui/UpgradeDialog;->updateBtn(Lcom/tencent/bugly/beta/download/DownloadTask;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_6
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 184
    .line 185
    aget-object p1, p1, v0

    .line 186
    .line 187
    if-eqz p1, :cond_4

    .line 188
    .line 189
    check-cast p1, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V

    .line 192
    .line 193
    .line 194
    :cond_4
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 195
    .line 196
    aget-object p1, p1, v1

    .line 197
    .line 198
    check-cast p1, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_7
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 205
    .line 206
    aget-object p1, p1, v1

    .line 207
    .line 208
    check-cast p1, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;

    .line 209
    .line 210
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :pswitch_8
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 215
    .line 216
    aget-object p1, p1, v0

    .line 217
    .line 218
    check-cast p1, Landroid/view/ViewGroup;

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-gtz p1, :cond_5

    .line 225
    .line 226
    iget-object p1, p0, Lcom/tencent/bugly/beta/global/b;->b:[Ljava/lang/Object;

    .line 227
    .line 228
    aget-object p1, p1, v1

    .line 229
    .line 230
    check-cast p1, Landroid/app/Activity;

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 233
    .line 234
    .line 235
    const-string p1, "BetaAct closed by empty view"

    .line 236
    .line 237
    :try_start_2
    new-array v0, v1, [Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_5

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 250
    .line 251
    .line 252
    :cond_5
    :goto_2
    return-void

    .line 253
    :pswitch_data_0
    .packed-switch 0x1
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
.end method
