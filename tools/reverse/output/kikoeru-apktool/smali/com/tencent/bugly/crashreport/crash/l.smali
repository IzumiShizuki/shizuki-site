.class public Lcom/tencent/bugly/crashreport/crash/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static a:Ljava/lang/String;

.field private static final b:Ljava/lang/Object;


# instance fields
.field protected final c:Landroid/content/Context;

.field protected final d:Lcom/tencent/bugly/crashreport/crash/e;

.field protected final e:Lcom/tencent/bugly/crashreport/common/strategy/c;

.field protected final f:Lcom/tencent/bugly/crashreport/common/info/a;

.field protected g:Ljava/lang/Thread$UncaughtExceptionHandler;

.field protected h:Ljava/lang/Thread$UncaughtExceptionHandler;

.field protected i:Z

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/crashreport/crash/l;->b:Ljava/lang/Object;

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
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/crashreport/crash/e;Lcom/tencent/bugly/crashreport/common/strategy/c;Lcom/tencent/bugly/crashreport/common/info/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->i:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->c:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/tencent/bugly/crashreport/crash/l;->d:Lcom/tencent/bugly/crashreport/crash/e;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/tencent/bugly/crashreport/crash/l;->e:Lcom/tencent/bugly/crashreport/common/strategy/c;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    .line 14
    .line 15
    return-void
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
.end method

.method public static a(Ljava/lang/Throwable;I)Ljava/lang/String;
    .locals 2

    .line 116
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    if-ltz p1, :cond_2

    .line 117
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, p1, :cond_1

    goto :goto_0

    .line 118
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n[Message over limit size:"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", has been cutted!]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 119
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z
    .locals 7

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 103
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 105
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    .line 106
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    .line 107
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    .line 108
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "uncaughtException"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method private a(Ljava/lang/Thread;)Z
    .locals 3

    .line 97
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/l;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 98
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/l;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/tencent/bugly/crashreport/crash/l;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 99
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/tencent/bugly/crashreport/crash/l;->a:Ljava/lang/String;

    const/4 p1, 0x0

    .line 101
    monitor-exit v0

    return p1

    .line 102
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static b(Ljava/lang/Throwable;I)Ljava/lang/String;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 103
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 104
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, p0, v3

    if-lez p1, :cond_1

    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lt v5, p1, :cond_1

    .line 106
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "\n[Stack over limit size :"

    :try_start_1
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p1, " , has been cutted !]"

    :try_start_2
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 108
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v4, "\n"

    :try_start_3
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 109
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    aput-object p0, p1, v1

    const-string p0, "gen stack error %s"

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 110
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[B)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 20
    new-array p1, v3, [Ljava/lang/Object;

    const-string v0, "We can do nothing with a null throwable."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return-object p1

    .line 21
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/h;->g()Lcom/tencent/bugly/crashreport/crash/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/tencent/bugly/crashreport/crash/h;->i()Z

    move-result v4

    const-string v5, ""

    if-eqz v4, :cond_1

    if-eqz p3, :cond_1

    const-string v6, " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]"

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_0
    if-eqz v4, :cond_2

    if-eqz p3, :cond_2

    .line 22
    new-array v4, v3, [Ljava/lang/Object;

    const-string v7, "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"

    invoke-static {v7, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 23
    :cond_2
    new-instance v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-direct {v4}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 24
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->h()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->C:J

    .line 25
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->j()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:J

    .line 26
    invoke-static {}, Lcom/tencent/bugly/crashreport/common/info/b;->g()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:J

    .line 27
    iget-object v7, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v7}, Lcom/tencent/bugly/crashreport/common/info/a;->v()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:J

    .line 28
    iget-object v7, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v7}, Lcom/tencent/bugly/crashreport/common/info/a;->w()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->G:J

    .line 29
    iget-object v7, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v7}, Lcom/tencent/bugly/crashreport/common/info/a;->x()J

    move-result-wide v7

    iput-wide v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:J

    .line 30
    iget-object v7, p0, Lcom/tencent/bugly/crashreport/crash/l;->c:Landroid/content/Context;

    sget v8, Lcom/tencent/bugly/crashreport/crash/h;->e:I

    sget-object v9, Lcom/tencent/bugly/crashreport/crash/h;->h:Ljava/lang/String;

    invoke-static {v7, v8, v9}, Lcom/tencent/bugly/proguard/ca;->a(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 31
    invoke-static {}, Lcom/tencent/bugly/proguard/ba;->b()[B

    move-result-object v7

    iput-object v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:[B

    if-nez v7, :cond_3

    const/4 v7, 0x0

    goto :goto_1

    .line 32
    :cond_3
    array-length v7, v7

    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v7, v9, v3

    const-string v7, "user log size:%d"

    invoke-static {v7, v9}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v7, 0x2

    if-eqz p3, :cond_4

    const/4 v9, 0x0

    goto :goto_2

    :cond_4
    const/4 v9, 0x2

    .line 33
    :goto_2
    iput v9, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:I

    .line 34
    iget-object v9, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v9}, Lcom/tencent/bugly/crashreport/common/info/a;->l()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    .line 35
    iget-object v9, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v10, v9, Lcom/tencent/bugly/crashreport/common/info/a;->E:Ljava/lang/String;

    iput-object v10, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f:Ljava/lang/String;

    .line 36
    invoke-virtual {v9}, Lcom/tencent/bugly/crashreport/common/info/a;->i()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Ljava/lang/String;

    .line 37
    iget-object v9, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {v9}, Lcom/tencent/bugly/crashreport/common/info/a;->y()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x3e8

    .line 39
    invoke-static {v0, v10}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    move-object v11, v5

    .line 40
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v12

    array-length v12, v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v13

    if-eqz v13, :cond_6

    const/4 v13, 0x1

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    :goto_3
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v12, v7, v3

    aput-object v13, v7, v8

    .line 42
    const-string v12, "stack frame :%d, has cause %b"

    invoke-static {v12, v7}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v7

    array-length v7, v7

    if-lez v7, :cond_7

    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v7

    aget-object v7, v7, v3

    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_7
    move-object v7, v5

    :goto_4
    move-object v12, v0

    :goto_5
    if-eqz v12, :cond_8

    .line 45
    invoke-virtual {v12}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v13

    if-eqz v13, :cond_8

    .line 46
    invoke-virtual {v12}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v12

    goto :goto_5

    :cond_8
    if-eqz v12, :cond_b

    if-eq v12, v0, :cond_b

    .line 47
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 48
    invoke-static {v12, v10}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    if-nez v0, :cond_9

    .line 49
    iput-object v5, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 50
    :cond_9
    invoke-virtual {v12}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_a

    .line 51
    invoke-virtual {v12}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/lang/String;

    .line 52
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\n......\nCaused by:\n"

    .line 55
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    iget-object v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    sget v5, Lcom/tencent/bugly/crashreport/crash/h;->f:I

    invoke-static {v12, v5}, Lcom/tencent/bugly/crashreport/crash/l;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v5

    .line 59
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/lang/String;

    goto :goto_6

    .line 61
    :cond_b
    iput-object v9, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 62
    invoke-static {v11, v5, v6}, Lj2/h0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 63
    iput-object v6, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    if-nez v6, :cond_c

    .line 64
    iput-object v5, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 65
    :cond_c
    iput-object v7, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/lang/String;

    .line 66
    sget v5, Lcom/tencent/bugly/crashreport/crash/h;->f:I

    invoke-static {v0, v5}, Lcom/tencent/bugly/crashreport/crash/l;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v5

    .line 67
    iput-object v5, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/lang/String;

    .line 68
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->r:J

    .line 69
    iget-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->c([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->u:Ljava/lang/String;

    .line 70
    :try_start_0
    sget v0, Lcom/tencent/bugly/crashreport/crash/h;->f:I

    .line 71
    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/ca;->a(IZ)Ljava/util/Map;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/util/Map;

    .line 72
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    iput-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:Ljava/lang/String;

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "("

    :try_start_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p1, ")"

    :try_start_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->B:Ljava/lang/String;

    .line 74
    iget-object v0, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/util/Map;

    invoke-interface {v0, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->r()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/lang/String;

    .line 76
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->p()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Ljava/util/Map;

    .line 77
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->o()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/util/Map;

    .line 78
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-wide v5, p1, Lcom/tencent/bugly/crashreport/common/info/a;->d:J

    iput-wide v5, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 79
    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->C()Z

    move-result p1

    iput-boolean p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:Z

    if-eqz p3, :cond_d

    .line 80
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->d:Lcom/tencent/bugly/crashreport/crash/e;

    invoke-virtual {p1, v4}, Lcom/tencent/bugly/crashreport/crash/e;->d(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_a

    :cond_d
    if-eqz v1, :cond_e

    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_e

    const/4 p1, 0x1

    goto :goto_7

    :cond_e
    const/4 p1, 0x0

    :goto_7
    if-eqz v2, :cond_f

    .line 82
    array-length v0, v2

    if-lez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_8

    :cond_f
    const/4 v0, 0x0

    :goto_8
    if-eqz p1, :cond_10

    .line 83
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, v8}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    const-string v5, "UserData"

    :try_start_3
    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    if-eqz v0, :cond_11

    .line 85
    iput-object v2, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:[B

    .line 86
    :cond_11
    :goto_9
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->A()I

    move-result p1

    iput p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:I

    .line 87
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->t()I

    move-result p1

    iput p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:I

    .line 88
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->h()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:Ljava/util/Map;

    .line 89
    iget-object p1, p0, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/crashreport/common/info/a;->g()Ljava/util/Map;

    move-result-object p1

    iput-object p1, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:Ljava/util/Map;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object v4

    .line 90
    :goto_a
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v8, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const-string p1, "handle crash error %s"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v4
.end method

.method public declared-synchronized a()V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->j:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0xa

    if-lt v0, v3, :cond_0

    .line 2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "java crash handler over %d, no need set."

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 3
    :cond_0
    :try_start_1
    iput-boolean v2, p0, Lcom/tencent/bugly/crashreport/crash/l;->i:Z

    .line 4
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 5
    const-class v3, Lcom/tencent/bugly/crashreport/crash/l;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_1

    monitor-exit p0

    return-void

    .line 8
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.android.internal.os.RuntimeInit$UncaughtHandler"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v3, "backup system java handler: %s"

    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const-string v3, "backup java handler: %s"

    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 14
    :cond_3
    :goto_0
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 15
    iget v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->j:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->j:I

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "registered java monitor: %s"

    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 3

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 109
    :try_start_0
    iget-boolean v0, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/l;->i:Z

    if-eq v0, v1, :cond_1

    .line 110
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "java changed to %b"

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 111
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z

    if-eqz p1, :cond_0

    .line 112
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/l;->a()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/l;->b()V

    goto :goto_1

    .line 114
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 115
    :cond_1
    :goto_1
    monitor-exit p0

    return-void
.end method

.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    const/4 p1, 0x0

    .line 17
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "current process die"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 18
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    const/4 p1, 0x1

    .line 19
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public declared-synchronized b()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->i:Z

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "close java monitor!"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 3
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bugly"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    aput-object v1, v3, v0

    const-string v0, "Java monitor to unregister: %s"

    invoke-static {v0, v3}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 7
    iget v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->j:I

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/tencent/bugly/crashreport/crash/l;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

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

    throw v0
.end method

.method public b(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[B)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    const-string v5, "crashreport last handle end!"

    const-string v6, "crashreport last handle start!"

    const-string v7, "system handle end!"

    const-string v8, "system handle start!"

    const-string v9, "sys default last handle end!"

    const-string v10, "sys default last handle start!"

    const/4 v11, 0x0

    if-eqz v4, :cond_1

    .line 8
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    aput-object v0, v13, v11

    const/4 v0, 0x1

    aput-object v12, v13, v0

    const-string v0, "Java Crash Happen cause by %s(%d)"

    invoke-static {v0, v13}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    invoke-direct/range {p0 .. p1}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    new-array v0, v11, [Ljava/lang/Object;

    const-string v12, "this class has handled this exception"

    invoke-static {v12, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 11
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_0

    .line 12
    new-array v0, v11, [Ljava/lang/Object;

    const-string v12, "call system handler"

    invoke-static {v12, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 15
    :cond_1
    new-array v0, v11, [Ljava/lang/Object;

    const-string v12, "Java Catch Happen"

    invoke-static {v12, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 16
    :cond_2
    :goto_0
    :try_start_0
    iget-boolean v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_5

    const-string v0, "Java crash handler is disable. Just return."

    .line 17
    :try_start_1
    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v0, v12}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_16

    .line 18
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_3

    invoke-direct {v1, v0}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v10, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 21
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 22
    :cond_3
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_4

    .line 23
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 24
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 25
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 26
    :cond_4
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 27
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 28
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    .line 29
    :cond_5
    :try_start_2
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->e:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/common/strategy/c;->d()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_6

    const-string v0, "no remote but still store!"

    .line 30
    :try_start_3
    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v0, v12}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    :cond_6
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->e:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/common/strategy/c;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v0

    .line 32
    iget-boolean v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v12, "JAVA_CATCH"

    const-string v13, "JAVA_CRASH"

    if-nez v0, :cond_a

    :try_start_4
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->e:Lcom/tencent/bugly/crashreport/common/strategy/c;

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/common/strategy/c;->d()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_a

    const-string v0, "crash report was closed by remote , will not upload to Bugly , print local for helpful!"

    .line 33
    :try_start_5
    new-array v14, v11, [Ljava/lang/Object;

    invoke-static {v0, v14}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz v4, :cond_7

    move-object v15, v13

    goto :goto_1

    :cond_7
    move-object v15, v12

    .line 34
    :goto_1
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->a()Ljava/lang/String;

    move-result-object v16

    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v0, v0, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v18

    invoke-static {v3}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    move-object/from16 v17, v0

    .line 35
    invoke-static/range {v15 .. v20}, Lcom/tencent/bugly/crashreport/crash/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v4, :cond_16

    .line 36
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_8

    invoke-direct {v1, v0}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 37
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v10, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 38
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 39
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 40
    :cond_8
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_9

    .line 41
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 42
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 43
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 44
    :cond_9
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 46
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 47
    :cond_a
    :try_start_6
    invoke-virtual/range {p0 .. p5}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[B)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v17
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v17, :cond_d

    const-string v0, "pkg crash datas fail!"

    .line 48
    :try_start_7
    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v0, v12}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v4, :cond_16

    .line 49
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_b

    invoke-direct {v1, v0}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 50
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v10, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 51
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 52
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 53
    :cond_b
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_c

    .line 54
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 55
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 56
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 57
    :cond_c
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 58
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 59
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_d
    if-eqz v4, :cond_e

    move-object v12, v13

    .line 60
    :cond_e
    :try_start_8
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->a()Ljava/lang/String;

    move-result-object v13

    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->f:Lcom/tencent/bugly/crashreport/common/info/a;

    iget-object v14, v0, Lcom/tencent/bugly/crashreport/common/info/a;->h:Ljava/lang/String;

    .line 61
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v16

    .line 62
    invoke-static/range {v12 .. v17}, Lcom/tencent/bugly/crashreport/crash/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    move-object/from16 v0, v17

    .line 63
    iget-object v12, v1, Lcom/tencent/bugly/crashreport/crash/l;->d:Lcom/tencent/bugly/crashreport/crash/e;

    invoke-virtual {v12, v0}, Lcom/tencent/bugly/crashreport/crash/e;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Z

    move-result v12

    if-nez v12, :cond_f

    .line 64
    iget-object v12, v1, Lcom/tencent/bugly/crashreport/crash/l;->d:Lcom/tencent/bugly/crashreport/crash/e;

    const-wide/16 v13, 0xbb8

    invoke-virtual {v12, v0, v13, v14, v4}, Lcom/tencent/bugly/crashreport/crash/e;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V

    :cond_f
    if-eqz v4, :cond_10

    .line 65
    iget-object v12, v1, Lcom/tencent/bugly/crashreport/crash/l;->d:Lcom/tencent/bugly/crashreport/crash/e;

    invoke-virtual {v12, v0}, Lcom/tencent/bugly/crashreport/crash/e;->e(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_10
    if-eqz v4, :cond_16

    .line 66
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_11

    invoke-direct {v1, v0}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 67
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v10, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 68
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 69
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 70
    :cond_11
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_12

    .line 71
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 72
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 73
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 74
    :cond_12
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 75
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 76
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 77
    :goto_2
    :try_start_9
    invoke-static {v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result v12

    if-nez v12, :cond_13

    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_13
    :goto_3
    if-eqz v4, :cond_16

    .line 79
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_14

    invoke-direct {v1, v0}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 80
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v10, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 81
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 82
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_4

    .line 83
    :cond_14
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_15

    .line 84
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v8, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 85
    iget-object v0, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 86
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v7, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_4

    .line 87
    :cond_15
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v6, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 88
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 89
    new-array v0, v11, [Ljava/lang/Object;

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_16
    :goto_4
    return-void

    :goto_5
    if-eqz v4, :cond_1a

    .line 90
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v4, :cond_18

    invoke-direct {v1, v4}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_6

    .line 91
    :cond_17
    new-array v4, v11, [Ljava/lang/Object;

    invoke-static {v10, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 92
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/l;->g:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v4, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 93
    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v9, v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_7

    .line 94
    :cond_18
    :goto_6
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v4, :cond_19

    .line 95
    new-array v4, v11, [Ljava/lang/Object;

    invoke-static {v8, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 96
    iget-object v4, v1, Lcom/tencent/bugly/crashreport/crash/l;->h:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v4, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 97
    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v7, v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_7

    .line 98
    :cond_19
    new-array v4, v11, [Ljava/lang/Object;

    invoke-static {v6, v4}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 99
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/crashreport/crash/l;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 100
    new-array v2, v11, [Ljava/lang/Object;

    invoke-static {v5, v2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 101
    :cond_1a
    :goto_7
    throw v0
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    const/4 v5, 0x1

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move-object v4, p2

    .line 10
    :try_start_0
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/bugly/crashreport/crash/l;->b(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[B)V

    .line 11
    .line 12
    .line 13
    monitor-exit v1

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
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
