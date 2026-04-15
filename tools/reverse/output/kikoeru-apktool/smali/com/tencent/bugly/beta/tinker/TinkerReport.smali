.class public Lcom/tencent/bugly/beta/tinker/TinkerReport;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;
    }
.end annotation


# static fields
.field public static final KEY_APPLIED:I = 0x5

.field public static final KEY_APPLIED_DEXOPT_EXIST:I = 0x7a

.field public static final KEY_APPLIED_DEXOPT_FORMAT:I = 0x7b

.field public static final KEY_APPLIED_DEXOPT_OTHER:I = 0x79

.field public static final KEY_APPLIED_DEX_EXTRACT:I = 0xb6

.field public static final KEY_APPLIED_EXCEPTION:I = 0x78

.field public static final KEY_APPLIED_FAIL_COST_10S_LESS:I = 0xce

.field public static final KEY_APPLIED_FAIL_COST_30S_LESS:I = 0xcf

.field public static final KEY_APPLIED_FAIL_COST_5S_LESS:I = 0xcd

.field public static final KEY_APPLIED_FAIL_COST_60S_LESS:I = 0xd0

.field public static final KEY_APPLIED_FAIL_COST_OTHER:I = 0xd1

.field public static final KEY_APPLIED_INFO_CORRUPTED:I = 0x7c

.field public static final KEY_APPLIED_LIB_EXTRACT:I = 0xb7

.field public static final KEY_APPLIED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND:I = 0x99

.field public static final KEY_APPLIED_PACKAGE_CHECK_DEX_META:I = 0x97

.field public static final KEY_APPLIED_PACKAGE_CHECK_LIB_META:I = 0x98

.field public static final KEY_APPLIED_PACKAGE_CHECK_META_NOT_FOUND:I = 0x9b

.field public static final KEY_APPLIED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND:I = 0x9a

.field public static final KEY_APPLIED_PACKAGE_CHECK_RES_META:I = 0x9d

.field public static final KEY_APPLIED_PACKAGE_CHECK_SIGNATURE:I = 0x96

.field public static final KEY_APPLIED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT:I = 0x9e

.field public static final KEY_APPLIED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL:I = 0x9c

.field public static final KEY_APPLIED_PATCH_FILE_EXTRACT:I = 0xb5

.field public static final KEY_APPLIED_RESOURCE_EXTRACT:I = 0xb8

.field public static final KEY_APPLIED_START:I = 0x4

.field public static final KEY_APPLIED_SUCC_COST_10S_LESS:I = 0xc9

.field public static final KEY_APPLIED_SUCC_COST_30S_LESS:I = 0xca

.field public static final KEY_APPLIED_SUCC_COST_5S_LESS:I = 0xc8

.field public static final KEY_APPLIED_SUCC_COST_60S_LESS:I = 0xcb

.field public static final KEY_APPLIED_SUCC_COST_OTHER:I = 0xcc

.field public static final KEY_APPLIED_UPGRADE:I = 0x64

.field public static final KEY_APPLIED_UPGRADE_FAIL:I = 0x65

.field public static final KEY_APPLIED_VERSION_CHECK:I = 0xb4

.field public static final KEY_APPLY_WITH_RETRY:I = 0xa

.field public static final KEY_CRASH_CAUSE_XPOSED_ART:I = 0x9

.field public static final KEY_CRASH_CAUSE_XPOSED_DALVIK:I = 0x8

.field public static final KEY_CRASH_FAST_PROTECT:I = 0x7

.field public static final KEY_DOWNLOAD:I = 0x1

.field public static final KEY_LOADED:I = 0x6

.field public static final KEY_LOADED_EXCEPTION_DEX:I = 0xfc

.field public static final KEY_LOADED_EXCEPTION_DEX_CHECK:I = 0xfd

.field public static final KEY_LOADED_EXCEPTION_RESOURCE:I = 0xfe

.field public static final KEY_LOADED_EXCEPTION_RESOURCE_CHECK:I = 0xff

.field public static final KEY_LOADED_INFO_CORRUPTED:I = 0x135

.field public static final KEY_LOADED_INTERPRET_GET_INSTRUCTION_SET_ERROR:I = 0x1c2

.field public static final KEY_LOADED_INTERPRET_INTERPRET_COMMAND_ERROR:I = 0x1c3

.field public static final KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK:I = 0x1c4

.field public static final KEY_LOADED_MISMATCH_DEX:I = 0x12c

.field public static final KEY_LOADED_MISMATCH_LIB:I = 0x12d

.field public static final KEY_LOADED_MISMATCH_RESOURCE:I = 0x12e

.field public static final KEY_LOADED_MISSING_DEX:I = 0x12f

.field public static final KEY_LOADED_MISSING_DEX_OPT:I = 0x133

.field public static final KEY_LOADED_MISSING_LIB:I = 0x130

.field public static final KEY_LOADED_MISSING_PATCH_FILE:I = 0x131

.field public static final KEY_LOADED_MISSING_PATCH_INFO:I = 0x132

.field public static final KEY_LOADED_MISSING_RES:I = 0x134

.field public static final KEY_LOADED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND:I = 0x161

.field public static final KEY_LOADED_PACKAGE_CHECK_DEX_META:I = 0x15f

.field public static final KEY_LOADED_PACKAGE_CHECK_LIB_META:I = 0x160

.field public static final KEY_LOADED_PACKAGE_CHECK_PACKAGE_META_NOT_FOUND:I = 0x164

.field public static final KEY_LOADED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND:I = 0x162

.field public static final KEY_LOADED_PACKAGE_CHECK_RES_META:I = 0x165

.field public static final KEY_LOADED_PACKAGE_CHECK_SIGNATURE:I = 0x15e

.field public static final KEY_LOADED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT:I = 0x166

.field public static final KEY_LOADED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL:I = 0x163

.field public static final KEY_LOADED_SUCC_COST_1000_LESS:I = 0x191

.field public static final KEY_LOADED_SUCC_COST_3000_LESS:I = 0x192

.field public static final KEY_LOADED_SUCC_COST_5000_LESS:I = 0x193

.field public static final KEY_LOADED_SUCC_COST_500_LESS:I = 0x190

.field public static final KEY_LOADED_SUCC_COST_OTHER:I = 0x194

.field public static final KEY_LOADED_UNCAUGHT_EXCEPTION:I = 0xfb

.field public static final KEY_LOADED_UNKNOWN_EXCEPTION:I = 0xfa

.field public static final KEY_REQUEST:I = 0x0

.field public static final KEY_TRY_APPLY:I = 0x2

.field public static final KEY_TRY_APPLY_ALREADY_APPLY:I = 0x4d

.field public static final KEY_TRY_APPLY_CONDITION_NOT_SATISFIED:I = 0x50

.field public static final KEY_TRY_APPLY_CRASH_LIMIT:I = 0x4f

.field public static final KEY_TRY_APPLY_DISABLE:I = 0x47

.field public static final KEY_TRY_APPLY_GOOGLEPLAY:I = 0x4b

.field public static final KEY_TRY_APPLY_INSERVICE:I = 0x49

.field public static final KEY_TRY_APPLY_JIT:I = 0x51

.field public static final KEY_TRY_APPLY_MEMORY_LIMIT:I = 0x4e

.field public static final KEY_TRY_APPLY_NOT_EXIST:I = 0x4a

.field public static final KEY_TRY_APPLY_ROM_SPACE:I = 0x4c

.field public static final KEY_TRY_APPLY_RUNNING:I = 0x48

.field public static final KEY_TRY_APPLY_SUCCESS:I = 0x3

.field public static final KEY_TRY_APPLY_UPGRADE:I = 0x46

.field private static final TAG:Ljava/lang/String; = "Tinker.TinkerReport"

.field private static reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;


# direct methods
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

.method public static onApplied(JZ)V
    .locals 5

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 10
    .line 11
    .line 12
    :cond_1
    if-eqz p2, :cond_2

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 15
    .line 16
    const/16 v1, 0x64

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 23
    .line 24
    const/16 v1, 0x65

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x1

    .line 34
    new-array v1, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object v0, v1, v2

    .line 38
    .line 39
    const-string v0, "hp_report report apply cost = %d"

    .line 40
    .line 41
    const-string v3, "Tinker.TinkerReport"

    .line 42
    .line 43
    invoke-static {v3, v0, v1}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    cmp-long v4, p0, v0

    .line 49
    .line 50
    if-gez v4, :cond_3

    .line 51
    .line 52
    new-array p0, v2, [Ljava/lang/Object;

    .line 53
    .line 54
    const-string p1, "hp_report report apply cost failed, invalid cost"

    .line 55
    .line 56
    invoke-static {v3, p1, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    const-wide/16 v0, 0x1388

    .line 61
    .line 62
    cmp-long v2, p0, v0

    .line 63
    .line 64
    if-gtz v2, :cond_5

    .line 65
    .line 66
    if-eqz p2, :cond_4

    .line 67
    .line 68
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 69
    .line 70
    const/16 p1, 0xc8

    .line 71
    .line 72
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 77
    .line 78
    const/16 p1, 0xcd

    .line 79
    .line 80
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const-wide/16 v0, 0x2710

    .line 85
    .line 86
    cmp-long v2, p0, v0

    .line 87
    .line 88
    if-gtz v2, :cond_7

    .line 89
    .line 90
    if-eqz p2, :cond_6

    .line 91
    .line 92
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 93
    .line 94
    const/16 p1, 0xc9

    .line 95
    .line 96
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_6
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 101
    .line 102
    const/16 p1, 0xce

    .line 103
    .line 104
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    const-wide/16 v0, 0x7530

    .line 109
    .line 110
    cmp-long v2, p0, v0

    .line 111
    .line 112
    if-gtz v2, :cond_9

    .line 113
    .line 114
    if-eqz p2, :cond_8

    .line 115
    .line 116
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 117
    .line 118
    const/16 p1, 0xca

    .line 119
    .line 120
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_8
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 125
    .line 126
    const/16 p1, 0xcf

    .line 127
    .line 128
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_9
    const-wide/32 v0, 0xea60

    .line 133
    .line 134
    .line 135
    cmp-long v2, p0, v0

    .line 136
    .line 137
    if-gtz v2, :cond_b

    .line 138
    .line 139
    if-eqz p2, :cond_a

    .line 140
    .line 141
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 142
    .line 143
    const/16 p1, 0xcb

    .line 144
    .line 145
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_a
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 150
    .line 151
    const/16 p1, 0xd0

    .line 152
    .line 153
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_b
    if-eqz p2, :cond_c

    .line 158
    .line 159
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 160
    .line 161
    const/16 p1, 0xcc

    .line 162
    .line 163
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_c
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 168
    .line 169
    const/16 p1, 0xd1

    .line 170
    .line 171
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 172
    .line 173
    .line 174
    return-void
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

.method public static onApplyCrash(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0x78

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Tinker Exception:apply tinker occur exception "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->getExceptionCauseString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
.end method

.method public static onApplyDexOptFail(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "checkDexOptExist failed"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 19
    .line 20
    const/16 v0, 0x7a

    .line 21
    .line 22
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "checkDexOptFormat failed"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 39
    .line 40
    const/16 v0, 0x7b

    .line 41
    .line 42
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 47
    .line 48
    const/16 v1, 0x79

    .line 49
    .line 50
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 54
    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "Tinker Exception:apply tinker occur exception "

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->getExceptionCauseString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public static onApplyExtractFail(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    if-eq p0, v1, :cond_4

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    if-eq p0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    if-eq p0, v1, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    const/16 p0, 0xb8

    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/16 p0, 0xb7

    .line 26
    .line 27
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_3
    const/16 p0, 0xb6

    .line 32
    .line 33
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_4
    const/16 p0, 0xb5

    .line 38
    .line 39
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public static onApplyInfoCorrupted()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0x7c

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public static onApplyPackageCheckFail(I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    const-string v0, "Tinker.TinkerReport"

    .line 17
    .line 18
    const-string v2, "hp_report package check failed, error = %d"

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lcom/tencent/tinker/lib/util/TinkerLog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    packed-switch p0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :pswitch_0
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 28
    .line 29
    const/16 v0, 0x96

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 36
    .line 37
    const/16 v0, 0x9b

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 44
    .line 45
    const/16 v0, 0x97

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 52
    .line 53
    const/16 v0, 0x98

    .line 54
    .line 55
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_4
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 60
    .line 61
    const/16 v0, 0x99

    .line 62
    .line 63
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_5
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 68
    .line 69
    const/16 v0, 0x9a

    .line 70
    .line 71
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_6
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 76
    .line 77
    const/16 v0, 0x9c

    .line 78
    .line 79
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_7
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 84
    .line 85
    const/16 v0, 0x9d

    .line 86
    .line 87
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_8
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 92
    .line 93
    const/16 v0, 0x9e

    .line 94
    .line 95
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch -0x9
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
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public static onApplyPatchServiceStart()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x4

    .line 7
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public static onApplyVersionCheckFail()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0xb4

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public static onFastCrashProtect()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x7

    .line 7
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public static onLoadException(Ljava/lang/Throwable;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, -0x4

    .line 7
    if-eq p1, v1, :cond_6

    .line 8
    .line 9
    const/4 v1, -0x3

    .line 10
    const-string v2, "Tinker.TinkerReport"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq p1, v1, :cond_4

    .line 14
    .line 15
    const/4 v1, -0x2

    .line 16
    if-eq p1, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    if-eq p1, v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_1
    const/16 p1, 0xfa

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "checkDexInstall failed"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 43
    .line 44
    const/16 v0, 0xfd

    .line 45
    .line 46
    invoke-interface {p1, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "tinker dex check fail:"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-array p1, v3, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v2, p0, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 74
    .line 75
    const/16 v0, 0xfc

    .line 76
    .line 77
    invoke-interface {p1, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v0, "tinker dex reflect fail:"

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-array v0, v3, [Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v2, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string v0, "checkResInstall failed"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 117
    .line 118
    const/16 v0, 0xff

    .line 119
    .line 120
    invoke-interface {p1, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 121
    .line 122
    .line 123
    new-instance p1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v0, "tinker res check fail:"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    new-array p1, v3, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v2, p0, p1}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 148
    .line 149
    const/16 v0, 0xfe

    .line 150
    .line 151
    invoke-interface {p1, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v0, "tinker res reflect fail:"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-array v0, v3, [Ljava/lang/Object;

    .line 173
    .line 174
    invoke-static {v2, p1, v0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_6
    const/16 p1, 0xfb

    .line 179
    .line 180
    invoke-interface {v0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 181
    .line 182
    .line 183
    :goto_0
    sget-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, "Tinker Exception:load tinker occur exception "

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-static {p0}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->getExceptionCauseString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-interface {p1, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static onLoadFileMisMatch(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x3

    .line 7
    if-eq p0, v1, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    if-eq p0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    if-eq p0, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    const/16 p0, 0x12e

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    const/16 p0, 0x12d

    .line 23
    .line 24
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_3
    const/16 p0, 0x12c

    .line 29
    .line 30
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
.end method

.method public static onLoadFileNotFound(I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void

    .line 10
    :pswitch_0
    const/16 p0, 0x134

    .line 11
    .line 12
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    const/16 p0, 0x130

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    const/16 p0, 0x133

    .line 23
    .line 24
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_3
    const/16 p0, 0x12f

    .line 29
    .line 30
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_4
    const/16 p0, 0x132

    .line 35
    .line 36
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_5
    const/16 p0, 0x131

    .line 41
    .line 42
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static onLoadInfoCorrupted()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0x135

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public static onLoadInterpretReport(ILjava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const-string v2, "Tinker Exception:interpret occur exception "

    .line 10
    .line 11
    if-eq p0, v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq p0, v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/16 p0, 0x1c3

    .line 18
    .line 19
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->getExceptionCauseString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const/16 p0, 0x1c2

    .line 45
    .line 46
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lcom/tencent/bugly/beta/tinker/TinkerUtils;->getExceptionCauseString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    const/16 p0, 0x1c4

    .line 72
    .line 73
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 74
    .line 75
    .line 76
    return-void
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

.method public static onLoadPackageCheckFail(I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :goto_0
    return-void

    .line 10
    :pswitch_0
    const/16 p0, 0x15e

    .line 11
    .line 12
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    const/16 p0, 0x164

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    const/16 p0, 0x15f

    .line 23
    .line 24
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_3
    const/16 p0, 0x160

    .line 29
    .line 30
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_4
    const/16 p0, 0x161

    .line 35
    .line 36
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_5
    const/16 p0, 0x162

    .line 41
    .line 42
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_6
    const/16 p0, 0x163

    .line 47
    .line 48
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_7
    const/16 p0, 0x165

    .line 53
    .line 54
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_8
    const/16 p0, 0x166

    .line 59
    .line 60
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch -0x9
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

.method public static onLoaded(J)V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x6

    .line 7
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p0, v0

    .line 13
    .line 14
    if-gez v2, :cond_1

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    new-array p0, p0, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string p1, "Tinker.TinkerReport"

    .line 20
    .line 21
    const-string v0, "hp_report report load cost failed, invalid cost"

    .line 22
    .line 23
    invoke-static {p1, v0, p0}, Lcom/tencent/tinker/lib/util/TinkerLog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-wide/16 v0, 0x1f4

    .line 28
    .line 29
    cmp-long v2, p0, v0

    .line 30
    .line 31
    if-gtz v2, :cond_2

    .line 32
    .line 33
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 34
    .line 35
    const/16 p1, 0x190

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const-wide/16 v0, 0x3e8

    .line 42
    .line 43
    cmp-long v2, p0, v0

    .line 44
    .line 45
    if-gtz v2, :cond_3

    .line 46
    .line 47
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 48
    .line 49
    const/16 p1, 0x191

    .line 50
    .line 51
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    const-wide/16 v0, 0xbb8

    .line 56
    .line 57
    cmp-long v2, p0, v0

    .line 58
    .line 59
    if-gtz v2, :cond_4

    .line 60
    .line 61
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 62
    .line 63
    const/16 p1, 0x192

    .line 64
    .line 65
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    const-wide/16 v0, 0x1388

    .line 70
    .line 71
    cmp-long v2, p0, v0

    .line 72
    .line 73
    if-gtz v2, :cond_5

    .line 74
    .line 75
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 76
    .line 77
    const/16 p1, 0x193

    .line 78
    .line 79
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 84
    .line 85
    const/16 p1, 0x194

    .line 86
    .line 87
    invoke-interface {p0, p1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 88
    .line 89
    .line 90
    return-void
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

.method public static onReportRetryPatch()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public static onTryApply(Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x2

    .line 7
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 11
    .line 12
    const/16 v1, 0x46

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    sget-object p0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    invoke-interface {p0, v0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
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

.method public static onTryApplyFail(I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    packed-switch p0, :pswitch_data_1

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :pswitch_0
    const/16 p0, 0x47

    .line 14
    .line 15
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    const/16 p0, 0x4a

    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    const/16 p0, 0x48

    .line 26
    .line 27
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    const/16 p0, 0x49

    .line 32
    .line 33
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    const/16 p0, 0x51

    .line 38
    .line 39
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    const/16 p0, 0x4d

    .line 44
    .line 45
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_6
    const/16 p0, 0x4b

    .line 50
    .line 51
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_7
    const/16 p0, 0x4c

    .line 56
    .line 57
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_8
    const/16 p0, 0x4e

    .line 62
    .line 63
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_9
    const/16 p0, 0x4f

    .line 68
    .line 69
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_a
    const/16 p0, 0x50

    .line 74
    .line 75
    invoke-interface {v0, p0}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch -0x18
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch -0x6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static onXposedCrash()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lcom/tencent/tinker/loader/shareutil/ShareTinkerInternals;->isVmArt()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    sget-object v0, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;->onReport(I)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method


# virtual methods
.method public setReporter(Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/tencent/bugly/beta/tinker/TinkerReport;->reporter:Lcom/tencent/bugly/beta/tinker/TinkerReport$Reporter;

    .line 2
    .line 3
    return-void
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
