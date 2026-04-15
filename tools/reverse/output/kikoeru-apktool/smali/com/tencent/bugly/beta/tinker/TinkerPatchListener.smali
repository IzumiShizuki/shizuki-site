.class public Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;
.super Lcom/tencent/tinker/lib/listener/DefaultPatchListener;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field protected static final NEW_PATCH_RESTRICTION_SPACE_SIZE_MIN:J = 0x3c00000L

.field private static final TAG:Ljava/lang/String; = "Tinker.TinkerPatchListener"


# instance fields
.field private final maxMemory:I

.field private final userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/tinker/lib/listener/DefaultPatchListener;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "activity"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/app/ActivityManager;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;->maxMemory:I

    .line 17
    .line 18
    const-string v0, "application maxMemory:"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x0

    .line 25
    new-array v0, v0, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v1, "Tinker.TinkerPatchListener"

    .line 28
    .line 29
    invoke-static {v1, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerManager;->userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;->userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public patchCheck(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;->userPatchListener:Lcom/tencent/tinker/lib/listener/PatchListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/tinker/lib/listener/PatchListener;->onPatchReceived(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/tencent/tinker/lib/listener/DefaultPatchListener;->patchCheck(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/tencent/tinker/loader/shareutil/SharePatchFileUtil;->getFileOrDirectorySize(Ljava/io/File;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x2

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    aput-object p1, v2, v3

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aput-object v1, v2, v4

    .line 34
    .line 35
    const-string v1, "receive a patch file: %s, file size:%d"

    .line 36
    .line 37
    const-string v5, "Tinker.TinkerPatchListener"

    .line 38
    .line 39
    invoke-static {v5, v1, v2}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1, p2}, Lcom/tencent/tinker/lib/listener/DefaultPatchListener;->patchCheck(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    iget p1, p0, Lcom/tencent/bugly/beta/tinker/TinkerPatchListener;->maxMemory:I

    .line 49
    .line 50
    const-wide/32 v1, 0x3c00000

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2, p1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->checkForPatchRecover(JI)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    :cond_1
    if-nez p1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Lcom/tencent/tinker/lib/listener/DefaultPatchListener;->context:Landroid/content/Context;

    .line 60
    .line 61
    const-string v2, "tinker_share_config"

    .line 62
    .line 63
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1, p2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/4 v1, 0x3

    .line 72
    if-lt p2, v1, :cond_2

    .line 73
    .line 74
    const/16 p1, -0x17

    .line 75
    .line 76
    :cond_2
    if-nez p1, :cond_4

    .line 77
    .line 78
    invoke-static {v0}, Lcom/tencent/tinker/loader/shareutil/ShareTinkerInternals;->fastGetPatchPackageMeta(Ljava/io/File;)Ljava/util/Properties;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-nez p2, :cond_3

    .line 83
    .line 84
    const/16 p1, -0x18

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    const-string v0, "platform"

    .line 88
    .line 89
    invoke-virtual {p2, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v0, "get platform:"

    .line 94
    .line 95
    invoke-static {v0, p2}, Lj2/h0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    new-array v0, v3, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v5, p2, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    :goto_0
    if-nez p1, :cond_5

    .line 105
    .line 106
    const/4 v3, 0x1

    .line 107
    :cond_5
    invoke-static {v3}, Lcom/tencent/bugly/beta/tinker/TinkerReport;->onTryApply(Z)V

    .line 108
    .line 109
    .line 110
    return p1
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
