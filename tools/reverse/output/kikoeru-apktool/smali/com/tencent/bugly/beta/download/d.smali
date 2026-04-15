.class public Lcom/tencent/bugly/beta/download/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


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
    iput p1, p0, Lcom/tencent/bugly/beta/download/d;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/beta/download/d;->b:[Ljava/lang/Object;

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
.method public declared-synchronized a(II)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/tencent/bugly/beta/download/d;->a:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/download/d;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    check-cast v4, Lcom/tencent/bugly/beta/download/DownloadTask;

    .line 18
    .line 19
    aget-object v2, v0, v2

    .line 20
    .line 21
    check-cast v2, Lcom/tencent/bugly/beta/ui/NetNotifyDialog;

    .line 22
    .line 23
    if-ne p2, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/tencent/bugly/beta/download/DownloadTask;->download()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :try_start_1
    const-string p1, "continue download"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    :try_start_2
    new-array p2, v3, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/tencent/bugly/beta/download/d;->b:[Ljava/lang/Object;

    .line 36
    .line 37
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    aput-object p2, p1, v1

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/ui/BaseDialogFrag;->close()V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :catch_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-eq p1, v1, :cond_2

    .line 52
    .line 53
    aget-object p1, v0, v1

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    :cond_2
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 64
    .line 65
    iget-boolean p2, p1, Lcom/tencent/bugly/beta/global/e;->U:Z

    .line 66
    .line 67
    if-nez p2, :cond_7

    .line 68
    .line 69
    iget-boolean p1, p1, Lcom/tencent/bugly/beta/global/e;->V:Z

    .line 70
    .line 71
    if-nez p1, :cond_7

    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/tencent/bugly/beta/download/DownloadTask;->stop()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    :try_start_3
    const-string p1, "wifi network change to mobile network, stop download"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    .line 78
    :try_start_4
    new-array p2, v3, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/tencent/bugly/beta/download/d;->b:[Ljava/lang/Object;

    .line 84
    .line 85
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    aput-object p2, p1, v1

    .line 88
    .line 89
    sget-object p1, Lcom/tencent/bugly/beta/global/e;->b:Lcom/tencent/bugly/beta/global/e;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/tencent/bugly/beta/global/e;->v:Landroid/content/Context;

    .line 92
    .line 93
    invoke-static {p1}, Lcom/tencent/bugly/crashreport/common/info/b;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-static {v2, v1}, Lcom/tencent/bugly/beta/ui/UiManager;->show(Lcom/tencent/bugly/beta/ui/BaseFrag;Z)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/tencent/bugly/beta/download/d;->b:[Ljava/lang/Object;

    .line 103
    .line 104
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 105
    .line 106
    aput-object p2, p1, v1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    if-eq p2, v1, :cond_4

    .line 110
    .line 111
    const/4 p1, 0x3

    .line 112
    if-eq p2, p1, :cond_4

    .line 113
    .line 114
    const/4 p1, 0x4

    .line 115
    if-eq p2, p1, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    sget-object p1, Lcom/tencent/bugly/proguard/p;->a:Lcom/tencent/bugly/proguard/p;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/p;->b()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Ljava/util/ArrayList;

    .line 125
    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_5

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    sget-object p2, Lcom/tencent/bugly/beta/upgrade/b;->a:Lcom/tencent/bugly/beta/upgrade/b;

    .line 136
    .line 137
    new-instance v0, Lcom/tencent/bugly/proguard/A;

    .line 138
    .line 139
    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/A;-><init>(Ljava/util/ArrayList;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0, v1}, Lcom/tencent/bugly/beta/upgrade/b;->a(Lcom/tencent/bugly/proguard/A;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_6
    :goto_0
    monitor-exit p0

    .line 147
    return-void

    .line 148
    :goto_1
    :try_start_5
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/Throwable;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-nez p2, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_2
    monitor-exit p0

    .line 158
    return-void

    .line 159
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 160
    throw p1
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
.end method
