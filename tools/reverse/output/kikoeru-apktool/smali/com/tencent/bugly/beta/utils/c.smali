.class public Lcom/tencent/bugly/beta/utils/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/beta/utils/c$b;,
        Lcom/tencent/bugly/beta/utils/c$a;
    }
.end annotation


# static fields
.field private static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/tencent/bugly/beta/utils/a;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/beta/utils/c$b;",
            ">;"
        }
    .end annotation
.end field

.field private g:[B

.field private h:J

.field private i:J

.field private j:Ljava/lang/String;

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field private r:J

.field private s:J

.field private t:J

.field private u:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

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

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->e:J

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->f:Ljava/util/HashMap;

    .line 14
    .line 15
    const/16 v3, 0x10

    .line 16
    .line 17
    new-array v3, v3, [B

    .line 18
    .line 19
    iput-object v3, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 20
    .line 21
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->h:J

    .line 22
    .line 23
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->i:J

    .line 24
    .line 25
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->k:J

    .line 28
    .line 29
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->l:J

    .line 30
    .line 31
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->m:J

    .line 32
    .line 33
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->n:J

    .line 34
    .line 35
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->o:J

    .line 36
    .line 37
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->p:J

    .line 38
    .line 39
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->q:J

    .line 40
    .line 41
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->r:J

    .line 42
    .line 43
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->s:J

    .line 44
    .line 45
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->t:J

    .line 46
    .line 47
    iput-wide v1, p0, Lcom/tencent/bugly/beta/utils/c;->u:J

    .line 48
    .line 49
    iput-object p1, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    .line 50
    .line 51
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 52
    .line 53
    const-wide/16 v0, 0x3

    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "x86"

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 65
    .line 66
    const-wide/16 v2, 0x7

    .line 67
    .line 68
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 76
    .line 77
    const-wide/16 v0, 0x8

    .line 78
    .line 79
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "mips"

    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 89
    .line 90
    const-wide/16 v2, 0xa

    .line 91
    .line 92
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 100
    .line 101
    const-wide/16 v0, 0x28

    .line 102
    .line 103
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "armeabi"

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 113
    .line 114
    const-wide/16 v0, 0x3e

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v1, "x86_64"

    .line 121
    .line 122
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    sget-object p1, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    .line 126
    .line 127
    const-wide/16 v0, 0xb7

    .line 128
    .line 129
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "arm64-v8a"

    .line 134
    .line 135
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    return-void
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
.end method

.method private a(B)J
    .locals 2

    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 17
    sget-wide v0, Lcom/tencent/bugly/beta/utils/a;->c:J

    return-wide v0

    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 18
    sget-wide v0, Lcom/tencent/bugly/beta/utils/a;->b:J

    return-wide v0

    .line 19
    :cond_1
    sget-wide v0, Lcom/tencent/bugly/beta/utils/a;->a:J

    return-wide v0
.end method

.method private static a(JJ)Ljava/lang/String;
    .locals 2

    .line 10
    sget-object v0, Lcom/tencent/bugly/beta/utils/c;->a:Ljava/util/HashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const-wide/16 v0, 0x40

    cmp-long p1, v0, p2

    if-nez p1, :cond_0

    const-string p1, "mips"

    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p0, "mips64"

    :cond_0
    return-object p0
.end method

.method private declared-synchronized a(JJJ)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/beta/utils/c$b;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 20
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->g()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 21
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 22
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/beta/utils/a;->b(J)Z

    move-result p1

    if-nez p1, :cond_1

    .line 23
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    .line 24
    :cond_1
    :try_start_2
    invoke-direct {p0, p3, p4, p5, p6}, Lcom/tencent/bugly/beta/utils/c;->b(JJ)Ljava/util/HashMap;

    move-result-object p1

    .line 25
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private static a([B)Z
    .locals 5

    .line 12
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-ge v0, v2, :cond_0

    return v1

    .line 13
    :cond_0
    aget-byte v0, p0, v1

    const/16 v3, 0x7f

    if-eq v3, v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    .line 14
    aget-byte v3, p0, v0

    const/16 v4, 0x45

    if-eq v4, v3, :cond_2

    return v1

    :cond_2
    const/4 v3, 0x2

    .line 15
    aget-byte v3, p0, v3

    const/16 v4, 0x4c

    if-eq v4, v3, :cond_3

    return v1

    .line 16
    :cond_3
    aget-byte p0, p0, v2

    const/16 v2, 0x46

    if-eq v2, p0, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method private b(B)J
    .locals 2

    .line 1
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    const-wide/16 v0, 0x20

    return-wide v0

    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    const-wide/16 v0, 0x40

    return-wide v0

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private declared-synchronized b(JJ)Ljava/util/HashMap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/beta/utils/c$b;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_4

    cmp-long v4, p3, v2

    if-gtz v4, :cond_0

    goto/16 :goto_2

    .line 5
    :cond_0
    :try_start_0
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    const/4 v3, 0x0

    :goto_0
    int-to-long v4, v3

    cmp-long v6, v4, p1

    if-gez v6, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->l()Lcom/tencent/bugly/beta/utils/c$a;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_1
    long-to-int p1, p3

    .line 7
    invoke-virtual {v2, p1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/beta/utils/c$a;

    .line 8
    new-instance p2, Ljava/io/File;

    iget-object p3, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->length()J

    move-result-wide p2

    .line 9
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p4, v3, v1

    const-string p4, "File length = %d"

    invoke-static {p4, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/utils/c$a;->d()J

    move-result-wide v3

    cmp-long p4, v3, p2

    if-ltz p4, :cond_2

    .line 11
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "The SO file is invalid or has a shell."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 12
    :cond_2
    :try_start_1
    new-instance v3, Lcom/tencent/bugly/beta/utils/d;

    iget-object v4, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/utils/c$a;->d()J

    move-result-wide v5

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/beta/utils/c$a;->e()J

    move-result-wide v7

    invoke-direct/range {v3 .. v8}, Lcom/tencent/bugly/beta/utils/d;-><init>(Ljava/lang/String;JJ)V

    .line 15
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    invoke-virtual {v2}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/tencent/bugly/beta/utils/c$a;

    .line 17
    invoke-virtual {p3}, Lcom/tencent/bugly/beta/utils/c$a;->c()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/tencent/bugly/beta/utils/d;->a(J)Ljava/lang/String;

    move-result-object p4

    .line 18
    new-instance v0, Lcom/tencent/bugly/beta/utils/c$b;

    invoke-direct {v0}, Lcom/tencent/bugly/beta/utils/c$b;-><init>()V

    .line 19
    invoke-virtual {v0, p4}, Lcom/tencent/bugly/beta/utils/c$b;->a(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p3}, Lcom/tencent/bugly/beta/utils/c$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/beta/utils/c$b;->a(J)V

    .line 21
    invoke-virtual {p3}, Lcom/tencent/bugly/beta/utils/c$a;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/beta/utils/c$b;->c(J)V

    .line 22
    invoke-virtual {p3}, Lcom/tencent/bugly/beta/utils/c$a;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/beta/utils/c$b;->d(J)V

    .line 23
    invoke-virtual {p3}, Lcom/tencent/bugly/beta/utils/c$a;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/beta/utils/c$b;->b(J)V

    .line 24
    invoke-virtual {p1, p4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 25
    :cond_3
    invoke-virtual {v3}, Lcom/tencent/bugly/beta/utils/d;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    .line 26
    :cond_4
    :goto_2
    :try_start_2
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "The SO file is invalid or has a shell."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private declared-synchronized b()V
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->a()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 4
    :try_start_2
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
.end method

.method private d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/c;->n:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method private e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/c;->t:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method private f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/c;->u:J

    .line 2
    .line 3
    return-wide v0
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
.end method

.method private declared-synchronized g()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/beta/utils/a;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->e:J

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/bugly/beta/utils/a;-><init>(Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "ElfParser"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    const/4 v0, 0x0

    .line 38
    return v0

    .line 39
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    throw v0
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

.method private declared-synchronized h()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/beta/utils/a;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/tencent/bugly/beta/utils/a;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "ElfParser"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    const/4 v0, 0x0

    .line 36
    return v0

    .line 37
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    throw v0
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

.method private i()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->j()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->b()V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private declared-synchronized j()Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->k()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "ElfParser"

    .line 10
    .line 11
    const-string v2, "Faile to parseElfHeader header indent of elf"

    .line 12
    .line 13
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return v1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->h:J

    .line 28
    .line 29
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->i:J

    .line 36
    .line 37
    iget-wide v4, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 38
    .line 39
    invoke-static {v2, v3, v4, v5}, Lcom/tencent/bugly/beta/utils/c;->a(JJ)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->k:J

    .line 52
    .line 53
    iget-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 54
    .line 55
    const-wide/16 v4, 0x20

    .line 56
    .line 57
    cmp-long v0, v4, v2

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->k:J

    .line 68
    .line 69
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->l:J

    .line 70
    .line 71
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->m:J

    .line 78
    .line 79
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->n:J

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catch_0
    move-exception v0

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const-wide/16 v4, 0x40

    .line 91
    .line 92
    cmp-long v0, v4, v2

    .line 93
    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->k:J

    .line 103
    .line 104
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->l:J

    .line 105
    .line 106
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->m:J

    .line 113
    .line 114
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->n:J

    .line 121
    .line 122
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->o:J

    .line 129
    .line 130
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 133
    .line 134
    .line 135
    move-result-wide v2

    .line 136
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->p:J

    .line 137
    .line 138
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 141
    .line 142
    .line 143
    move-result-wide v2

    .line 144
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->q:J

    .line 145
    .line 146
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->r:J

    .line 153
    .line 154
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 157
    .line 158
    .line 159
    move-result-wide v2

    .line 160
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->s:J

    .line 161
    .line 162
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 163
    .line 164
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 165
    .line 166
    .line 167
    move-result-wide v2

    .line 168
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->t:J

    .line 169
    .line 170
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->i()J

    .line 173
    .line 174
    .line 175
    move-result-wide v2

    .line 176
    iput-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->u:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    monitor-exit p0

    .line 179
    const/4 v0, 0x1

    .line 180
    return v0

    .line 181
    :cond_2
    :try_start_2
    const-string v0, "ElfParser"

    .line 182
    .line 183
    const-string v2, "File format error"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    .line 185
    :try_start_3
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 186
    .line 187
    .line 188
    monitor-exit p0

    .line 189
    return v1

    .line 190
    :goto_1
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v2, "ElfParser"

    .line 195
    .line 196
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 197
    .line 198
    .line 199
    monitor-exit p0

    .line 200
    return v1

    .line 201
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 202
    throw v0
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

.method private declared-synchronized k()Z
    .locals 9

    .line 1
    const-string v0, "Endian error: "

    .line 2
    .line 3
    const-string v1, "File format error: "

    .line 4
    .line 5
    const-string v2, "Not a elf file: "

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v3, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 11
    .line 12
    invoke-virtual {v3, v4}, Lcom/tencent/bugly/beta/utils/a;->a([B)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const-string v0, "ElfParser"

    .line 20
    .line 21
    const-string v1, "Fail to parseElfHeader elf indentification"

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return v4

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_1
    iget-object v3, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 31
    .line 32
    invoke-static {v3}, Lcom/tencent/bugly/beta/utils/c;->a([B)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "ElfParser"

    .line 53
    .line 54
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return v4

    .line 59
    :cond_1
    :try_start_2
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 60
    .line 61
    const/4 v3, 0x4

    .line 62
    aget-byte v2, v2, v3

    .line 63
    .line 64
    invoke-direct {p0, v2}, Lcom/tencent/bugly/beta/utils/c;->b(B)J

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    iput-wide v5, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 69
    .line 70
    const-wide/16 v7, 0x0

    .line 71
    .line 72
    cmp-long v2, v7, v5

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 82
    .line 83
    aget-byte v1, v1, v3

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v1, "ElfParser"

    .line 93
    .line 94
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    .line 97
    monitor-exit p0

    .line 98
    return v4

    .line 99
    :cond_2
    :try_start_3
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 100
    .line 101
    const/4 v2, 0x5

    .line 102
    aget-byte v1, v1, v2

    .line 103
    .line 104
    invoke-direct {p0, v1}, Lcom/tencent/bugly/beta/utils/c;->a(B)J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    iput-wide v5, p0, Lcom/tencent/bugly/beta/utils/c;->e:J

    .line 109
    .line 110
    sget-wide v7, Lcom/tencent/bugly/beta/utils/a;->a:J

    .line 111
    .line 112
    cmp-long v1, v7, v5

    .line 113
    .line 114
    if-nez v1, :cond_3

    .line 115
    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->g:[B

    .line 122
    .line 123
    aget-byte v0, v0, v2

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "ElfParser"

    .line 133
    .line 134
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    .line 136
    .line 137
    monitor-exit p0

    .line 138
    return v4

    .line 139
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 140
    .line 141
    invoke-virtual {v0, v5, v6}, Lcom/tencent/bugly/beta/utils/a;->a(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 142
    .line 143
    .line 144
    monitor-exit p0

    .line 145
    const/4 v0, 0x1

    .line 146
    return v0

    .line 147
    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 148
    throw v0
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
.end method

.method private declared-synchronized l()Lcom/tencent/bugly/beta/utils/c$a;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/beta/utils/c$a;

    .line 3
    .line 4
    invoke-direct {v0}, Lcom/tencent/bugly/beta/utils/c$a;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_1
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->g(J)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->j(J)V

    .line 24
    .line 25
    .line 26
    iget-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 27
    .line 28
    const-wide/16 v4, 0x40

    .line 29
    .line 30
    const-wide/16 v6, 0x20

    .line 31
    .line 32
    cmp-long v8, v6, v2

    .line 33
    .line 34
    if-nez v8, :cond_0

    .line 35
    .line 36
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->d(J)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->a(J)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->h(J)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->i(J)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_0
    cmp-long v8, v4, v2

    .line 80
    .line 81
    if-nez v8, :cond_3

    .line 82
    .line 83
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->d(J)V

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->a(J)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->h(J)V

    .line 108
    .line 109
    .line 110
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->i(J)V

    .line 117
    .line 118
    .line 119
    :goto_0
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 120
    .line 121
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->f(J)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 129
    .line 130
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->e(J)V

    .line 135
    .line 136
    .line 137
    iget-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->d:J

    .line 138
    .line 139
    cmp-long v8, v6, v2

    .line 140
    .line 141
    if-nez v8, :cond_1

    .line 142
    .line 143
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 146
    .line 147
    .line 148
    move-result-wide v2

    .line 149
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->b(J)V

    .line 150
    .line 151
    .line 152
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->g()J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->c(J)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    cmp-long v6, v4, v2

    .line 163
    .line 164
    if-nez v6, :cond_2

    .line 165
    .line 166
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 167
    .line 168
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->b(J)V

    .line 173
    .line 174
    .line 175
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/c;->b:Lcom/tencent/bugly/beta/utils/a;

    .line 176
    .line 177
    invoke-virtual {v2}, Lcom/tencent/bugly/beta/utils/a;->h()J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    invoke-virtual {v0, v2, v3}, Lcom/tencent/bugly/beta/utils/c$a;->c(J)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    .line 183
    .line 184
    :goto_1
    monitor-exit p0

    .line 185
    return-object v0

    .line 186
    :cond_2
    :try_start_2
    const-string v0, "ElfParser"

    .line 187
    .line 188
    const-string v2, "File format error"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    .line 190
    :try_start_3
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    .line 192
    .line 193
    monitor-exit p0

    .line 194
    return-object v1

    .line 195
    :cond_3
    :try_start_4
    const-string v0, "ElfParser"

    .line 196
    .line 197
    const-string v2, "File format error"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    .line 199
    :try_start_5
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 200
    .line 201
    .line 202
    monitor-exit p0

    .line 203
    return-object v1

    .line 204
    :goto_2
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    const-string v2, "ElfParser"

    .line 209
    .line 210
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 211
    .line 212
    .line 213
    monitor-exit p0

    .line 214
    return-object v1

    .line 215
    :goto_3
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 216
    throw v0
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

.method private declared-synchronized m()Z
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->d()J

    .line 3
    .line 4
    .line 5
    move-result-wide v2

    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->e()J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->f()J

    .line 11
    .line 12
    .line 13
    move-result-wide v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    move-object v1, p0

    .line 15
    :try_start_1
    invoke-direct/range {v1 .. v7}, Lcom/tencent/bugly/beta/utils/c;->a(JJJ)Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, v1, Lcom/tencent/bugly/beta/utils/c;->f:Ljava/util/HashMap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_0

    .line 30
    :catchall_1
    move-exception v0

    .line 31
    move-object v1, p0

    .line 32
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw v0
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


# virtual methods
.method public declared-synchronized a()Ljava/lang/String;
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ElfParser"

    const-string v1, "Failed to parseElfHeader elf header"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "armeabi"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    monitor-exit p0

    return-object v0

    .line 5
    :cond_1
    :try_start_2
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/c;->m()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "ElfParser"

    const-string v2, "Failed to parseElfHeader section table"

    .line 6
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    .line 7
    :cond_2
    :try_start_3
    iget-object v1, p0, Lcom/tencent/bugly/beta/utils/c;->f:Ljava/util/HashMap;

    const-string v2, ".ARM.attributes"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/beta/utils/c$b;

    if-nez v1, :cond_3

    const-string v1, "ElfParser"

    const-string v2, "No .ARM.attributes section in the elf file"

    .line 8
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v0

    .line 9
    :cond_3
    :try_start_4
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/c;->c:Ljava/lang/String;

    iget-wide v2, p0, Lcom/tencent/bugly/beta/utils/c;->e:J

    invoke-virtual {v1}, Lcom/tencent/bugly/beta/utils/c$b;->a()J

    move-result-wide v4

    invoke-static {v0, v2, v3, v4, v5}, Lcom/tencent/bugly/beta/utils/b;->a(Ljava/lang/String;JJ)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method
