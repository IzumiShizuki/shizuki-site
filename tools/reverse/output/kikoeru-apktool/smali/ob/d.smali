.class public final Lob/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "unknown"

    .line 13
    .line 14
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 p2, 0x1

    .line 36
    new-array p2, p2, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    aput-object p1, p2, v0

    .line 40
    .line 41
    const-string v0, ">>> %s onCreated <<<"

    .line 42
    .line 43
    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p2, Lcom/tencent/bugly/crashreport/common/info/a;->na:Ljava/util/List;

    .line 53
    .line 54
    const-string v0, "onCreated"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lcom/tencent/bugly/crashreport/biz/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
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
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "unknown"

    .line 13
    .line 14
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x1

    .line 36
    new-array v0, v0, [Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    aput-object p1, v0, v1

    .line 40
    .line 41
    const-string v1, ">>> %s onDestroyed <<<"

    .line 42
    .line 43
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/info/a;->na:Ljava/util/List;

    .line 53
    .line 54
    const-string v1, "onDestroyed"

    .line 55
    .line 56
    invoke-static {p1, v1}, Lcom/tencent/bugly/crashreport/biz/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    return-void
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

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 7

    .line 1
    const-string v0, "unknown"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v0

    .line 15
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v2, 0x1

    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    aput-object v1, v2, v3

    .line 41
    .line 42
    const-string v4, ">>> %s onPaused <<<"

    .line 43
    .line 44
    invoke-static {v4, v2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    :goto_1
    return-void

    .line 54
    :cond_2
    iget-object v4, v2, Lcom/tencent/bugly/crashreport/common/info/a;->na:Ljava/util/List;

    .line 55
    .line 56
    const-string v5, "onPaused"

    .line 57
    .line 58
    invoke-static {v1, v5}, Lcom/tencent/bugly/crashreport/biz/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Z)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    iput-wide v3, v2, Lcom/tencent/bugly/crashreport/common/info/a;->Y:J

    .line 73
    .line 74
    iget-wide v5, v2, Lcom/tencent/bugly/crashreport/common/info/a;->X:J

    .line 75
    .line 76
    sub-long v5, v3, v5

    .line 77
    .line 78
    iput-wide v5, v2, Lcom/tencent/bugly/crashreport/common/info/a;->Z:J

    .line 79
    .line 80
    invoke-static {v3, v4}, Lcom/tencent/bugly/crashreport/biz/f;->b(J)J

    .line 81
    .line 82
    .line 83
    iget-wide v3, v2, Lcom/tencent/bugly/crashreport/common/info/a;->Z:J

    .line 84
    .line 85
    const-wide/16 v5, 0x0

    .line 86
    .line 87
    cmp-long v1, v3, v5

    .line 88
    .line 89
    if-gez v1, :cond_3

    .line 90
    .line 91
    iput-wide v5, v2, Lcom/tencent/bugly/crashreport/common/info/a;->Z:J

    .line 92
    .line 93
    :cond_3
    if-eqz p1, :cond_4

    .line 94
    .line 95
    const-string p1, "background"

    .line 96
    .line 97
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/common/info/a;->W:Ljava/lang/String;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    iput-object v0, v2, Lcom/tencent/bugly/crashreport/common/info/a;->W:Ljava/lang/String;

    .line 101
    .line 102
    return-void
    .line 103
    .line 104
    .line 105
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 9

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "unknown"

    .line 13
    .line 14
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    new-array v1, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    aput-object p1, v1, v2

    .line 41
    .line 42
    const-string v3, ">>> %s onResumed <<<"

    .line 43
    .line 44
    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/a;->m()Lcom/tencent/bugly/crashreport/common/info/a;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_2
    iget-object v3, v1, Lcom/tencent/bugly/crashreport/common/info/a;->na:Ljava/util/List;

    .line 56
    .line 57
    const-string v4, "onResumed"

    .line 58
    .line 59
    invoke-static {p1, v4}, Lcom/tencent/bugly/crashreport/biz/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/crashreport/common/info/a;->a(Z)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v1, Lcom/tencent/bugly/crashreport/common/info/a;->W:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    iput-wide v3, v1, Lcom/tencent/bugly/crashreport/common/info/a;->X:J

    .line 76
    .line 77
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->d()J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    sub-long/2addr v3, v5

    .line 82
    iput-wide v3, v1, Lcom/tencent/bugly/crashreport/common/info/a;->aa:J

    .line 83
    .line 84
    iget-wide v3, v1, Lcom/tencent/bugly/crashreport/common/info/a;->X:J

    .line 85
    .line 86
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->e()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    sub-long/2addr v3, v5

    .line 91
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->f()J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    const-wide/16 v7, 0x0

    .line 96
    .line 97
    cmp-long p1, v5, v7

    .line 98
    .line 99
    if-lez p1, :cond_3

    .line 100
    .line 101
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->f()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->g()J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    :goto_1
    cmp-long p1, v3, v5

    .line 111
    .line 112
    if-lez p1, :cond_5

    .line 113
    .line 114
    invoke-virtual {v1}, Lcom/tencent/bugly/crashreport/common/info/a;->F()V

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->i()I

    .line 118
    .line 119
    .line 120
    const-wide/16 v5, 0x3e8

    .line 121
    .line 122
    div-long/2addr v3, v5

    .line 123
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->g()J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    div-long/2addr v3, v5

    .line 132
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const/4 v3, 0x2

    .line 137
    new-array v3, v3, [Ljava/lang/Object;

    .line 138
    .line 139
    aput-object p1, v3, v2

    .line 140
    .line 141
    aput-object v1, v3, v0

    .line 142
    .line 143
    const-string p1, "[session] launch app one times (app in background %d seconds and over %d seconds)"

    .line 144
    .line 145
    invoke-static {p1, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->h()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->j()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    rem-int/2addr p1, v0

    .line 157
    const/4 v0, 0x4

    .line 158
    if-nez p1, :cond_4

    .line 159
    .line 160
    sget-object p1, Lcom/tencent/bugly/crashreport/biz/f;->i:Lcom/tencent/bugly/crashreport/biz/c;

    .line 161
    .line 162
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->k()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {p1, v0, v1, v7, v8}, Lcom/tencent/bugly/crashreport/biz/c;->a(IZJ)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_4
    sget-object p1, Lcom/tencent/bugly/crashreport/biz/f;->i:Lcom/tencent/bugly/crashreport/biz/c;

    .line 171
    .line 172
    invoke-virtual {p1, v0, v2, v7, v8}, Lcom/tencent/bugly/crashreport/biz/c;->a(IZJ)V

    .line 173
    .line 174
    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 176
    .line 177
    .line 178
    move-result-wide v0

    .line 179
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->b()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    sub-long v3, v0, v3

    .line 184
    .line 185
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->c()J

    .line 186
    .line 187
    .line 188
    move-result-wide v5

    .line 189
    cmp-long p1, v3, v5

    .line 190
    .line 191
    if-lez p1, :cond_5

    .line 192
    .line 193
    invoke-static {v0, v1}, Lcom/tencent/bugly/crashreport/biz/f;->a(J)J

    .line 194
    .line 195
    .line 196
    new-array p1, v2, [Ljava/lang/Object;

    .line 197
    .line 198
    const-string v0, "add a timer to upload hot start user info"

    .line 199
    .line 200
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->k()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_5

    .line 208
    .line 209
    sget-object p1, Lcom/tencent/bugly/crashreport/biz/f;->i:Lcom/tencent/bugly/crashreport/biz/c;

    .line 210
    .line 211
    invoke-static {}, Lcom/tencent/bugly/crashreport/biz/f;->c()J

    .line 212
    .line 213
    .line 214
    move-result-wide v0

    .line 215
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/crashreport/biz/c;->a(J)V

    .line 216
    .line 217
    .line 218
    :cond_5
    :goto_2
    return-void
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
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
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
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
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
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
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
.end method
