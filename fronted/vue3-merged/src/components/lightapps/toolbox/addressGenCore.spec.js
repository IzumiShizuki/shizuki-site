import { describe, expect, it } from 'vitest';
import {
  ADDRESS_COUNTRIES,
  findAddressCountry,
  formatAddressProfileText,
  generateAddressProfiles,
  listAddressRegions
} from './addressGenCore';

const FIXED_NOW = '2026-07-26T12:00:00Z';

function seededValues(length = 512, salt = 12345) {
  return Uint32Array.from({ length }, (_, index) => (index * 2654435761 + salt) >>> 0);
}

describe('addressGenCore 数据集', () => {
  it('包含 5 个国家且德国有全部 16 个联邦州', () => {
    expect(ADDRESS_COUNTRIES.map((item) => item.code)).toEqual(['DE', 'US', 'GB', 'JP', 'FR']);
    expect(listAddressRegions('DE')).toHaveLength(16);
  });

  it('每个地区都有城市，且城市数据字段完整', () => {
    for (const country of ADDRESS_COUNTRIES) {
      expect(country.regions.length).toBeGreaterThan(0);
      for (const region of country.regions) {
        expect(region.code).toBeTruthy();
        expect(region.cities.length).toBeGreaterThan(0);
        for (const city of region.cities) {
          expect(city.name).toBeTruthy();
          if (country.code === 'JP') {
            expect(city.districts.length).toBeGreaterThan(0);
            for (const district of city.districts) {
              expect(district.postal).toMatch(/^\d{3}-\d{4}$/);
              expect(district.nameEn).toBeTruthy();
            }
          } else if (country.code === 'GB') {
            expect(city.outward.length).toBeGreaterThan(0);
            for (const outward of city.outward) expect(outward).toMatch(/^[A-Z]{1,2}\d{1,2}[A-Z]?$/);
          } else {
            expect(city.postal.length).toBeGreaterThan(0);
            for (const postal of city.postal) expect(postal).toMatch(/^\d{5}$/);
          }
        }
      }
    }
  });

  it('按国家代码查找不区分大小写，未知代码返回 null', () => {
    expect(findAddressCountry('de')?.label).toBe('德国');
    expect(findAddressCountry('XX')).toBeNull();
    expect(listAddressRegions('XX')).toEqual([]);
  });
});

describe('generateAddressProfiles', () => {
  it('批量数量在 1-10 之间收敛', () => {
    expect(generateAddressProfiles({ country: 'DE', count: 5, now: FIXED_NOW }, seededValues())).toHaveLength(5);
    expect(generateAddressProfiles({ country: 'DE', count: 99, now: FIXED_NOW }, seededValues())).toHaveLength(10);
    expect(generateAddressProfiles({ country: 'DE', count: 0, now: FIXED_NOW }, seededValues())).toHaveLength(1);
  });

  it('相同随机序列生成结果确定', () => {
    const first = generateAddressProfiles({ country: 'US', count: 3, now: FIXED_NOW }, seededValues());
    const second = generateAddressProfiles({ country: 'US', count: 3, now: FIXED_NOW }, seededValues());
    expect(first).toEqual(second);
  });

  it('可以固定地区与性别', () => {
    const profiles = generateAddressProfiles(
      { country: 'DE', region: 'BY', gender: 'female', count: 4, now: FIXED_NOW },
      seededValues(512, 777)
    );
    for (const profile of profiles) {
      expect(profile.regionCode).toBe('BY');
      expect(profile.regionName).toBe('Bayern');
      expect(profile.gender).toBe('female');
      expect(profile.genderLabel).toBe('女');
    }
  });

  it('德国资料字段格式正确', () => {
    const [profile] = generateAddressProfiles({ country: 'DE', now: FIXED_NOW }, seededValues(512, 31));
    expect(profile.postalCode).toMatch(/^\d{5}$/);
    expect(profile.birthday).toMatch(/^\d{4}-\d{2}-\d{2}$/);
    expect(profile.email).toMatch(/^[a-z0-9.]+@[a-z0-9.-]+$/);
    expect(profile.phone.startsWith('0')).toBe(true);
    expect(profile.phoneIntl.startsWith('+49 ')).toBe(true);
    expect(profile.addressIntl.endsWith('Germany')).toBe(true);
    expect(profile.addressLocal).toContain(profile.postalCode);
    expect(profile.addressLocal).toContain(profile.streetLine);
  });

  it('年龄与生日在固定时间基准下一致', () => {
    const now = new Date(FIXED_NOW);
    const profiles = generateAddressProfiles({ country: 'FR', count: 10, now: FIXED_NOW }, seededValues(1024, 99));
    for (const profile of profiles) {
      const birth = new Date(`${profile.birthday}T00:00:00Z`);
      let age = now.getUTCFullYear() - birth.getUTCFullYear();
      const beforeBirthday = now.getUTCMonth() < birth.getUTCMonth()
        || (now.getUTCMonth() === birth.getUTCMonth() && now.getUTCDate() < birth.getUTCDate());
      if (beforeBirthday) age -= 1;
      expect(profile.age).toBe(age);
      expect(profile.age).toBeGreaterThanOrEqual(18);
      expect(profile.age).toBeLessThanOrEqual(60);
    }
  });

  it('日本资料使用日式格式与罗马字', () => {
    const [profile] = generateAddressProfiles({ country: 'JP', region: 'TOKYO', now: FIXED_NOW }, seededValues(512, 7));
    expect(profile.postalCode).toMatch(/^〒\d{3}-\d{4}$/);
    expect(profile.addressLocal.startsWith('〒')).toBe(true);
    expect(profile.addressLocal).toContain('東京都');
    expect(profile.addressLocal).toContain('丁目');
    expect(profile.addressIntl.endsWith('Japan')).toBe(true);
    expect(profile.fullNameEn).not.toBe(profile.fullName);
    expect(profile.email).toMatch(/^[a-z0-9.]+@[a-z0-9.-]+$/);
  });

  it('英国邮编与电话格式正确', () => {
    const profiles = generateAddressProfiles({ country: 'GB', count: 6, now: FIXED_NOW }, seededValues(1024, 55));
    for (const profile of profiles) {
      expect(profile.postalCode).toMatch(/^[A-Z]{1,2}\d{1,2}[A-Z]?\s\d[A-Z]{2}$/);
      expect(profile.phoneIntl.startsWith('+44 ')).toBe(true);
      expect(profile.addressIntl.endsWith('United Kingdom')).toBe(true);
    }
  });

  it('未知国家回退到德国', () => {
    const [profile] = generateAddressProfiles({ country: 'ZZ', now: FIXED_NOW }, seededValues());
    expect(profile.country).toBe('DE');
  });
});

describe('formatAddressProfileText', () => {
  it('输出包含关键字段标签', () => {
    const [profile] = generateAddressProfiles({ country: 'US', now: FIXED_NOW }, seededValues(512, 3));
    const text = formatAddressProfileText(profile);
    expect(text).toContain(`姓名: ${profile.fullName}`);
    expect(text).toContain(`邮箱: ${profile.email}`);
    expect(text).toContain('本地格式:');
    expect(text).toContain(profile.addressIntl);
    expect(formatAddressProfileText(null)).toBe('');
  });
});
